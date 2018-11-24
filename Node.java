import java.util.LinkedList;

public class Node {
	private Type type;
	private int index;
	private String name, token;
	private LinkedList<Node> collection;
	private Node momNode;
	public int currentChild, totalChildren;
	
	public Node(Type nt, int ind, String name, String token){
		type = nt;
		index = ind;
		this.name = name;
		this.token = token;
	}
	
	public Node(Type nt, int ind, String name){
		type = nt;
		index = ind;
		this.name = name;
		this.token = null;
	}
	
	public void addChild(Node child){
		collection.add(child);
	}
	
	public Type getType(){
		return type;
	}
	
	public int getIndex(){
		return index;
	}
	
	public String getName(){
		return name;
	}
	
	public String getToken(){
		return token;
	}
	
	public LinkedList<Node> getChildren(){
		return collection;
	}
	
	public Node getMom(){
		return momNode;
	}
	
	public void setMom(Node newMom){
		momNode = newMom;
	}
}
