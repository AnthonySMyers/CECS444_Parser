import java.util.LinkedList;

public class A6_GrammarRules {
	private LinkedList<Node[]> rules;
	private AllNodes nodes;
	
	public A6_GrammarRules(){
		Node[] rule73 = new Node[3];
		rule73[0] = nodes.Lval;
		rule73[1] = nodes.equal;
		rule73[2] = nodes.Expr;
		rules.add(rule73);
	}
}
