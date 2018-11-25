import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Parser {
	private LinkedList<Node> stack = new LinkedList<Node>();
	private LL_Table table = new LL_Table();
	private AllNodes nodes = new AllNodes();
	private A6_GrammarRules rules = new A6_GrammarRules();
	private Node root, startNode;
	private boolean isNotComment = true, errorFlag = false, ntCheck = true;
	private int treeSize = 0, parensCounter = 0, recursiveCount = 0;
	
	public Parser(){
		stack.add(nodes.eof);
		stack.add(nodes.Pgm);
		root = nodes.Pgm;
		//System.out.println(root.currentChild);
		root.height = 0;
		startNode = root;
	}
	
	public void PSTmech(String inputStream){
		//System.out.println("This is: "+inputStream);
		if(root != null){
			startNode = root;
		}
		//System.out.println(root.getChildren().size());
		while(ntCheck){
			System.out.println("Front: "+inputStream);
			System.out.println("Stack: "+stack.getLast().getName());
			if(stack.getLast().getType().equals(Type.TERMINAL)){
				/*if(!nodes.terminals.containsKey(inputStream)){
					stack.getLast().setToken("id");
					root.getChildren().get(root.currentChild).setToken("id");
				}*/
				M1: if(inputStream.equals(stack.getLast().getToken())){
					if(stack.getLast().getToken().equals("$")){
						ntCheck = false;
						return;
					}
					else if(!stack.getLast().getToken().equals("$")){
						//root = root.getMom();
						//System.out.println(stack.getLast().getName());
						root.currentChild++;
						stack.removeLast();
						ntCheck = false;
						return;
					}
				}
				M2E: if(!inputStream.equals(stack.getLast().getToken())){
					if(stack.getLast().getToken() == null){
						root.setToken(inputStream);
						root = root.getMom();
						ntCheck = false;
						stack.removeLast();
					}
					else{
						errorFlag = true;
						ntCheck = false;
						System.out.println("M2E");
						return;
					}
				}
			}
			else if(stack.getLast().getType().equals(Type.NONTERMINAL) && ntCheck){
				int cell;
				if(nodes.terminals.containsKey(inputStream)){
					cell = table.getTable()[stack.getLast().getIndex()][nodes.terminals.get(inputStream)];
				}
				else{
					System.out.println(stack.getLast().getName() +" : "+nodes.terminals.get("id"));
					cell = table.getTable()[stack.getLast().getIndex()][nodes.terminals.get("id")];
				}
				M3E: if(cell == 0){
					System.out.println("["+stack.getLast().getIndex()+", "+nodes.terminals.get(inputStream)+"]");
					errorFlag = true;
					System.out.println("M3E");
					ntCheck = false;
					return;
				}
				M4: if(cell != 0){
					stack.removeLast();
					pushReverse(cell);
					if(root.currentChild < root.totalChildren){
						//System.out.println(root.getName());
						if(root.getChildren().get(root.currentChild) != null && !root.getChildren().get(root.currentChild).getType().equals(Type.TERMINAL)){
							root.currentChild++;
							root = root.getChildren().get(root.currentChild-1);
						}

						if(root.getMom() != null){
							root.height = root.getMom().height + 1;
						}
					}
					addChildren(cell, root);
				}
					if(root.getMom() != null && root.currentChild >= root.totalChildren){
						root = root.getMom();
					}
				}
			}
		}
	
	public void readFile(File fileName)throws Exception{
		Scanner scLines = new Scanner(fileName);						//Scanner to read string values line by line
		String currentStr;												//String used to reference the most recently scanned string from source code text
		while(scLines.hasNextLine() && !errorFlag){
			String lineRead = scLines.nextLine();
			Scanner sc = new Scanner(lineRead);
			isNotComment = true;
			while(sc.hasNext() && !errorFlag){
				ntCheck = true;
				currentStr = sc.next();
				if(!currentStr.equals("//") && isNotComment){
					//System.out.println(currentStr);
					PSTmech(currentStr);
				}
				else{
					isNotComment = false;
				}
			}
			sc.close();
		}
		scLines.close();
		if(errorFlag){
			System.out.println("ERROR");
		}
	}
	
	public void printPST(Node curNode){
		BS: if(curNode == null){
			return;
		}
		POP: if(curNode.getType().equals(Type.TERMINAL)){
			for(int i = 0; i < curNode.height; i++){
				System.out.print("\t");
			}
			System.out.print("(Node: ('"+curNode.getToken()+"')");
			if(treeSize > recursiveCount){
				System.out.println();
			}
			else{
				for(int i = 0; i < parensCounter; i++){
					System.out.print(")");
				}
			}
		}
		else if(curNode.getType().equals(Type.NONTERMINAL)){
			for(int i = 0; i < curNode.height; i++){
				System.out.print("\t");
			}
			System.out.print("(Node: (Rule: "+curNode.getName()+" = ");
			for(int i = 0; i < curNode.getChildren().size(); i++){
				if(curNode.getChildren().get(i).getType().equals(Type.TERMINAL)){
					System.out.print("'"+curNode.getChildren().get(i).getToken()+"' ");
				}
				else if(curNode.getChildren().get(i).getType().equals(Type.NONTERMINAL)){
					System.out.print(curNode.getChildren().get(i).getName()+" ");
				}
			}
			System.out.println(")");
		}
		RECURSION: for(int i = 0; i < curNode.getChildren().size(); i++){
			curNode.getChildren().get(i).height = curNode.height+1;
			parensCounter = curNode.height+1;
			//System.out.println(curNode.height);
			recursiveCount++;
			printPST(curNode.getChildren().get(i));
		}
	}
	
	public void pushReverse(int ruleNumber){
		//System.out.println("Rule #"+ruleNumber);
		if(rules.getRules().get(ruleNumber-1)[0] != null)
		{
			for(int i = rules.getRules().get(ruleNumber-1).length-1; i >= 0; i--){
				//System.out.print(rules.getRules().get(ruleNumber-1)[i].getName()+" ");
				stack.add(rules.getRules().get(ruleNumber-1)[i]);
				//System.out.print(stack.get(count).getName()+" ");
			}
			//System.out.println(stack.get(count).getName());
		}
	}
	
	public void addChildren(int ruleNumber, Node momNode){
		if(rules.getRules().get(ruleNumber-1)[0] != null){
			for(int i = 0; i < rules.getRules().get(ruleNumber-1).length; i++){
				momNode.getChildren().add(rules.getRules().get(ruleNumber-1)[i]);
				if(momNode.getChildren().get(i).getName().equals(momNode.getName())){
					momNode.getChildren().set(i, new Node(Type.NONTERMINAL, momNode.getIndex(), momNode.getName()));
				}
				momNode.getChildren().get(i).setMom(momNode);
				//System.out.print(i+" "+momNode.getChildren().get(i).getName()+" "+ruleNumber+" ");
				treeSize++;
				momNode.totalChildren++;
			}
		}
		else if(rules.getRules().get(ruleNumber-1)[0] == null){
			root = root.getMom();
			//System.out.println(root.getName());
			root.getChildren().remove(root.currentChild-1);
			treeSize--;
			root.currentChild--;
			root.totalChildren--;
		}
	}
	
	public void resetRoot(){
		if(root != null){
			while(root.getMom() != null){
				System.out.println(root.getName());
				root = root.getMom();
			}
		}
	}
	
	public Node getRoot(){
		return root;
	}
}
