import java.util.LinkedList;

public class Node {
	private Type type;
	private int index;
	private String name, token;
	private LinkedList<Node> collection;
	
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
}
