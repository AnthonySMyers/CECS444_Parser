
public class AllNodes {
			//Non-Terminals
			Node Pgm = new Node(Type.NONTERMINAL, 0, "Pgm");
			Node Main = new Node(Type.NONTERMINAL, 1, "Main");
			Node BBlock = new Node(Type.NONTERMINAL, 2, "BBlock");
			Node Vargroup = new Node(Type.NONTERMINAL, 3, "Vargroup");
			Node PPvarlist = new Node(Type.NONTERMINAL, 4, "PPvarlist");
			Node Varlist = new Node(Type.NONTERMINAL, 5, "Varlist");
			Node VarlistTail = new Node(Type.NONTERMINAL, 6, "VarlistTail");
			Node VarlItem = new Node(Type.NONTERMINAL, 7, "VarlItem");
			Node A = new Node(Type.NONTERMINAL, 8, "A");
			Node VarlItemTail = new Node(Type.NONTERMINAL, 9, "VarlItemTail");
			Node ClassDefTail = new Node(Type.NONTERMINAL, 10, "ClassDefTail");
			Node VarlDecl = new Node(Type.NONTERMINAL, 11, "VarlDecl");
			Node Simplekind = new Node(Type.NONTERMINAL, 12, "Simplekind");
			Node Basekind = new Node(Type.NONTERMINAL, 13, "Basekind");
			Node Classid = new Node(Type.NONTERMINAL, 14, "Classid");
			Node VarSpec = new Node(Type.NONTERMINAL, 15, "VarSpec");
			Node VarSpecTail = new Node(Type.NONTERMINAL, 16, "VarSpecTail");
			Node Varid = new Node(Type.NONTERMINAL, 17, "Varid");
			Node Arrspec = new Node(Type.NONTERMINAL, 18, "Arrspec");
			Node KKint = new Node(Type.NONTERMINAL, 19, "KKint");
			Node Deref_id = new Node(Type.NONTERMINAL, 20, "Deref_id");
			Node Deref = new Node(Type.NONTERMINAL, 21, "Deref");
			Node Varinit = new Node(Type.NONTERMINAL, 22, "Varinit");
			Node BBexprs = new Node(Type.NONTERMINAL, 23, "BBexprs");
			Node BBexprsTail = new Node(Type.NONTERMINAL, 24, "BBexprsTail");
			Node Exprlist = new Node(Type.NONTERMINAL, 25, "Exprlist");
			Node Moreexprs = new Node(Type.NONTERMINAL, 26, "Moreexprs");
			Node Classdecl = new Node(Type.NONTERMINAL, 27, "Classdecl");
			Node Classdef = new Node(Type.NONTERMINAL, 28, "Classdef");
			Node BBClassitems = new Node(Type.NONTERMINAL, 29, "BBClassitems");
			Node Classheader = new Node(Type.NONTERMINAL, 30, "Classheader");
			Node Classmom = new Node(Type.NONTERMINAL, 31, "Classmom");
			Node Classitems = new Node(Type.NONTERMINAL, 32, "Classitems");
			Node ClassitemsTail = new Node(Type.NONTERMINAL, 33, "ClassitemsTail");
			Node Classgroup = new Node(Type.NONTERMINAL, 34, "Classgroup");
			Node ClassgroupTail = new Node(Type.NONTERMINAL, 35, "ClassgroupTail");
			Node Class_ctrl = new Node(Type.NONTERMINAL, 36, "Class_ctrl");
			Node Interfaces = new Node(Type.NONTERMINAL, 37, "Interfaces");
			Node Mddecls = new Node(Type.NONTERMINAL, 38, "Mddecls");
			Node Mdheader = new Node(Type.NONTERMINAL, 39, "Mdheader");
			Node Md_id = new Node(Type.NONTERMINAL, 40, "Md_id");
			Node Fcndefs = new Node(Type.NONTERMINAL, 41, "Fcndefs");
			Node Fcndef = new Node(Type.NONTERMINAL, 42, "Fcndef");
			Node Fcnheader = new Node(Type.NONTERMINAL, 43, "Fcnheader");
			Node Fcnid = new Node(Type.NONTERMINAL, 44, "Fcnid");
			Node Retkind = new Node(Type.NONTERMINAL, 45, "Retkind");
			Node PParmlist = new Node(Type.NONTERMINAL, 46, "PParmlist");
			Node PParmlistTail = new Node(Type.NONTERMINAL, 47, "PParmlistTail");
			Node Varspecs = new Node(Type.NONTERMINAL, 48, "Varspecs");
			Node More_varspecs = new Node(Type.NONTERMINAL, 49, "More_varspecs");
			Node PPonly = new Node(Type.NONTERMINAL, 50, "PPonly");
			Node Stmts = new Node(Type.NONTERMINAL, 51, "Stmts");
			Node Stmt = new Node(Type.NONTERMINAL, 52, "Stmt");
			Node StmtTail = new Node(Type.NONTERMINAL, 53, "StmtTail");
			Node Stasgn = new Node(Type.NONTERMINAL, 54, "Stasgn");
			Node Lval = new Node(Type.NONTERMINAL, 55, "Lval");
			Node LvalTail = new Node(Type.NONTERMINAL, 56, "LvalTail");
			Node Aref = new Node(Type.NONTERMINAL, 57, "Aref");
			Node KKexpr = new Node(Type.NONTERMINAL, 58, "KKexpr");
			Node Fcall = new Node(Type.NONTERMINAL, 59, "Fcall");
			Node PPexprs = new Node(Type.NONTERMINAL, 60, "PPexprs");
			Node PPexprsTail = new Node(Type.NONTERMINAL, 61, "PPexprsTail");
			Node Stif = new Node(Type.NONTERMINAL, 62, "Stif");
			Node Elsepart = new Node(Type.NONTERMINAL, 63, "Elsepart");
			Node Stwhile = new Node(Type.NONTERMINAL, 64, "Stwhile");
			Node Stprint = new Node(Type.NONTERMINAL, 65, "Stprint");
			Node Strtn = new Node(Type.NONTERMINAL, 66, "Strtn");
			Node StrtnTail = new Node(Type.NONTERMINAL, 67, "StrtnTail");
			Node PPexpr = new Node(Type.NONTERMINAL, 68, "PPexpr");
			Node Expr = new Node(Type.NONTERMINAL, 69, "Expr");
			Node Rterm = new Node(Type.NONTERMINAL, 70, "Rterm");
			Node Term = new Node(Type.NONTERMINAL, 71, "Term");
			Node Fact = new Node(Type.NONTERMINAL, 72, "Fact");
			Node FactTail = new Node(Type.NONTERMINAL, 73, "FactTail");
			Node Addrof_id = new Node(Type.NONTERMINAL, 74, "Addrof_id");
			Node Oprel = new Node(Type.NONTERMINAL, 75, "Oprel");
			Node Lthan = new Node(Type.NONTERMINAL, 76, "Lthan");
			Node Gthan = new Node(Type.NONTERMINAL, 77, "Gthan");
			Node Opadd = new Node(Type.NONTERMINAL, 78, "Opadd");
			Node Opmul = new Node(Type.NONTERMINAL, 79, "Opmul");
			
			//Terminals
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