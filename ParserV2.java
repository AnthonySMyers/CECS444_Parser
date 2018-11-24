import java.io.File;
import java.util.LinkedList;

public class Parser {
	private LinkedList<Node> stack;
	private LL_Table table;
	private AllNodes nodes;
	private A6_GrammarRules rules;
	private Node root;
	
	public Parser(){
		stack.add(nodes.eof);
		stack.add(nodes.Pgm);
		root.getChildren().add(nodes.Pgm);
	}
	
	public void PSTmech(String inputStream, boolean errorFlag){
		while(!stack.isEmpty()){
			if(stack.getLast().getType().equals(Type.TERMINAL)){
				M1: if(inputStream.equals(stack.getLast().getToken())){
					if(stack.getLast().equals("$")){
						errorFlag = true;
						return;
					}
					else if(!stack.getLast().equals("$")){
						root = root.getMom();
						stack.pop();
						return;
					}
				}
				M2E: if(!inputStream.equals(stack.getLast().getToken())){
					return;
				}
			}
			else if(stack.getLast().getType().equals(Type.NONTERMINAL)){
				int cell = table.getTable()[stack.getLast().getIndex()][nodes.terminals.get(inputStream)];
				M3E: if(cell == 0){
					errorFlag = true;
					return;
				}
				M4: if(cell != 0){
					stack.pop();
					pushReverse(cell);
					addChildren(cell, root);
					root.currentChild++;
					if(root.currentChild <= root.totalChildren){
						root = root.getChildren().get(root.currentChild-1);
					}
					if(root.currentChild > root.totalChildren || root == null){
						if(root == null){
							root = root.getMom();
							
						}
						root = root.getMom();
					}
				}
			}
		}
	}
	
	public void readFile(File filename)throws Exception{
		
	}
	
	public void pushReverse(int ruleNumber){
		for(int i = rules.getRules().get(ruleNumber-1).length-1; i >= 0; i--){
			stack.push(rules.getRules().get(ruleNumber-1)[i]);
		}
	}
	
	public void addChildren(int ruleNumber, Node momNode){
		for(int i = 0; i < rules.getRules().get(ruleNumber-1).length-1; i++){
			momNode.getChildren().add(rules.getRules().get(ruleNumber-1)[i]);
			momNode.getChildren().get(i).setMom(momNode);
			root.totalChildren++;
		}
	}
}
