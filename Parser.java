import java.util.LinkedList;

public class Parser {
	private LinkedList<Node> symbols;
	
	public Parser(){
		Node Pgm = new Node(Type.NONTERMINAL, 0, "Pgm");
		Node Main = new Node(Type.NONTERMINAL, 1, "Main");
		Node BBlock = new Node(Type.NONTERMINAL, 2, "BBlock");
		Node Vargroup = new Node(Type.NONTERMINAL, 3, "Vargroup");
		Node PPvarlist = new Node(Type.NONTERMINAL, 4, "PPvarlist");
	}
}
