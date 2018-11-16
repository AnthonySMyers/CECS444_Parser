import java.util.LinkedList;

public class Parser {
	private LinkedList<Node> symbols;
	
	public Parser(){
		Node Pgm = new Node(Type.NONTERMINAL, 0, "Pgm");
		Node Main = new Node(Type.NONTERMINAL, 1, "Main");
		Node BBlock = new Node(Type.NONTERMINAL, 2, "BBlock");
		Node Vargroup = new Node(Type.NONTERMINAL, 3, "Vargroup");
		Node PPvarlist = new Node(Type.NONTERMINAL, 4, "PPvarlist");
		Node kwdprog = new Node(Type.TERMINAL, 0, "kwdprog", "prog");
		Node kwdmain = new Node(Type.TERMINAL, 1, "kwdmain", "main");
		Node brace1 = new Node(Type.TERMINAL, 2, "brace1", "{");
		Node brace2 = new Node(Type.TERMINAL, 3, "brace2", "}");
		Node kwdvars = new Node(Type.TERMINAL, 4, "kwdvars", "vars");
		Node parens1 = new Node(Type.TERMINAL, 5, "parens1", "(");
		Node parens2 = new Node(Type.TERMINAL, 6, "parens2", ")");
		Node semi = new Node(Type.TERMINAL, 7, "semi", ";");
		Node equal = new Node(Type.TERMINAL, 8, "equal", "=");
		Node Int = new Node(Type.TERMINAL, 9, "int", "int");
		Node Float = new Node(Type.TERMINAL, 10, "float", "float");
		Node string = new Node(Type.TERMINAL, 11, "string", "String");
		Node id = new Node(Type.TERMINAL, 12, "id");
		Node bracket1 = new Node(Type.TERMINAL, 13, "bracket1", "[");
		Node bracket2 = new Node(Type.TERMINAL, 14, "bracket2", "]");
		Node aster = new Node(Type.TERMINAL, 15, "aster", "*");
		Node comma = new Node(Type.TERMINAL, 16, "comma", ",");
		Node kwdclass = new Node(Type.TERMINAL, 17, "kwdclass", "class");
		Node colon = new Node(Type.TERMINAL, 18, "colon", ":");
		Node kwdfcn = new Node(Type.TERMINAL, 19, "kwdfcn", "function");
		Node kwdif = new Node(Type.TERMINAL, 20, "kwdif", "if");
		Node kwdelseif = new Node(Type.TERMINAL, 21, "kwdelseif", "else if");
		Node kwdelse = new Node(Type.TERMINAL, 22, "kwdelse", "else");
		Node kwdwhile = new Node(Type.TERMINAL, 23, "kwdwhile", "while");
		Node kprint = new Node(Type.TERMINAL, 24, "kprint", "print");
		Node kwdreturn = new Node(Type.TERMINAL, 25, "kwdreturn", "return");
		Node ampersand = new Node(Type.TERMINAL, 26, "ampersand", "&");
		Node opeq = new Node(Type.TERMINAL, 27, "opeq", "==");
		Node opne = new Node(Type.TERMINAL, 28, "opne", "!=");
		Node ople = new Node(Type.TERMINAL, 29, "ople", "<=");
		Node opge = new Node(Type.TERMINAL, 30, "opge", ">=");
		Node angle1 = new Node(Type.TERMINAL, 31, "angle1", "<");
		Node angle2 = new Node(Type.TERMINAL, 32, "angle2", ">");
		Node plus = new Node(Type.TERMINAL, 33, "plus", "+");
		Node minus = new Node(Type.TERMINAL, 34, "minus", "-");
		Node slash = new Node(Type.TERMINAL, 35, "slash", "/");
		Node caret = new Node(Type.TERMINAL, 36, "caret", "^");
		Node eof = new Node(Type.TERMINAL, 37, "eof", "$");
	}
}
