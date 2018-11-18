package project1;

import java.util.LinkedList;
import java.util.*;

public class Parser {
	private LinkedList<Node> symbols;
	
	public Parser(){
		Node[] arrSym = new Node[] 
				{
					new Node(Type.NONTERMINAL, 0, "Pgm"),
					new Node(Type.NONTERMINAL, 1, "Main"),
					new Node(Type.NONTERMINAL, 2, "BBlock"),
					new Node(Type.NONTERMINAL, 3, "Vargroup"),
					new Node(Type.NONTERMINAL, 4, "PPvarlist"),
					new Node(Type.NONTERMINAL, 5, "Varlist"),
					new Node(Type.NONTERMINAL, 6, "VarlistTail"),
					new Node(Type.NONTERMINAL, 7, "VarlItem"),
					new Node(Type.NONTERMINAL, 8, "A"),
					new Node(Type.NONTERMINAL, 9, "VarlItemTail"),
					new Node(Type.NONTERMINAL, 10, "ClassDefTail"),
					new Node(Type.NONTERMINAL, 11, "VarlDecl"),
					new Node(Type.NONTERMINAL, 12, "Simplekind"),
					new Node(Type.NONTERMINAL, 13, "Basekind"),
					new Node(Type.NONTERMINAL, 14, "Classid"),
					new Node(Type.NONTERMINAL, 15, "VarSpec"),
					new Node(Type.NONTERMINAL, 16, "VarSpecTail"),
					new Node(Type.NONTERMINAL, 17, "Varid"),
					new Node(Type.NONTERMINAL, 18, "Arrspec"),
					new Node(Type.NONTERMINAL, 19, "KKint"),
					new Node(Type.NONTERMINAL, 20, "Deref_id"),
					new Node(Type.NONTERMINAL, 21, "Deref"),
					new Node(Type.NONTERMINAL, 22, "Varinit"),
					new Node(Type.NONTERMINAL, 23, "BBexprs"),
					new Node(Type.NONTERMINAL, 24, "BBexprsTail"),
					new Node(Type.NONTERMINAL, 25, "Exprlist"),
					new Node(Type.NONTERMINAL, 26, "Moreexprs"),
					new Node(Type.NONTERMINAL, 27, "Classdecl"),
					new Node(Type.NONTERMINAL, 28, "Classdef"),
					new Node(Type.NONTERMINAL, 29, "BBClassitems"),
					new Node(Type.NONTERMINAL, 30, "Classheader"),
					new Node(Type.NONTERMINAL, 31, "Classmom"),
					new Node(Type.NONTERMINAL, 32, "Classitems"),
					new Node(Type.NONTERMINAL, 33, "ClassitemsTail"),
					new Node(Type.NONTERMINAL, 34, "Classgroup"),
					new Node(Type.NONTERMINAL, 35, "ClassgroupTail"),
					new Node(Type.NONTERMINAL, 36, "Class_ctrl"),
					new Node(Type.NONTERMINAL, 37, "Interfaces"),
					new Node(Type.NONTERMINAL, 38, "Mddecls"),
					new Node(Type.NONTERMINAL, 39, "Mdheader"),
					new Node(Type.NONTERMINAL, 40, "Md_id"),
					new Node(Type.NONTERMINAL, 41, "Fcndefs"),
					new Node(Type.NONTERMINAL, 42, "Fcndef"),
					new Node(Type.NONTERMINAL, 43, "Fcnheader"),
					new Node(Type.NONTERMINAL, 44, "Fcnid"),
					new Node(Type.NONTERMINAL, 45, "Retkind"),
					new Node(Type.NONTERMINAL, 46, "PParmlist"),
					new Node(Type.NONTERMINAL, 47, "PParmlistTail"),
					new Node(Type.NONTERMINAL, 48, "Varspecs"),
					new Node(Type.NONTERMINAL, 49, "More_varspecs"),
					new Node(Type.NONTERMINAL, 50, "PPonly"),
					new Node(Type.NONTERMINAL, 51, "Stmts"),
					new Node(Type.NONTERMINAL, 52, "Stmt"),
					new Node(Type.NONTERMINAL, 53, "StmtTail"),
					new Node(Type.NONTERMINAL, 54, "Stasgn"),
					new Node(Type.NONTERMINAL, 55, "Lval"),
					new Node(Type.NONTERMINAL, 56, "LvalTail"),
					new Node(Type.NONTERMINAL, 57, "Aref"),
					new Node(Type.NONTERMINAL, 58, "KKexpr"),
					new Node(Type.NONTERMINAL, 59, "Fcall"),
					new Node(Type.NONTERMINAL, 60, "PPexprs"),
					new Node(Type.NONTERMINAL, 61, "PPexprsTail"),
					new Node(Type.NONTERMINAL, 62, "Stif"),
					new Node(Type.NONTERMINAL, 63, "Elsepart"),
					new Node(Type.NONTERMINAL, 64, "Stwhile"),
					new Node(Type.NONTERMINAL, 65, "Stprint"),
					new Node(Type.NONTERMINAL, 66, "Strtn"),
					new Node(Type.NONTERMINAL, 67, "StrtnTail"),
					new Node(Type.NONTERMINAL, 68, "PPexpr"),
					new Node(Type.NONTERMINAL, 69, "Expr"),
					new Node(Type.NONTERMINAL, 70, "Rterm"),
					new Node(Type.NONTERMINAL, 71, "Term"),
					new Node(Type.NONTERMINAL, 72, "Fact"),
					new Node(Type.NONTERMINAL, 73, "FactTail"),
					new Node(Type.NONTERMINAL, 74, "Addrof_id"),
					new Node(Type.NONTERMINAL, 75, "Oprel"),
					new Node(Type.NONTERMINAL, 76, "Lthan"),
					new Node(Type.NONTERMINAL, 77, "Gthan"),
					new Node(Type.NONTERMINAL, 78, "Opadd"),
					new Node(Type.NONTERMINAL, 79, "Opmul"),
					
					//Terminals
					new Node(Type.TERMINAL, 0, "kwdprog", "prog"),
					new Node(Type.TERMINAL, 1, "kwdmain", "main"),
					new Node(Type.TERMINAL, 2, "brace1", "{"),
					new Node(Type.TERMINAL, 3, "brace2", "}"),
					new Node(Type.TERMINAL, 4, "kwdvars", "vars"),
					new Node(Type.TERMINAL, 5, "parens1", "("),
					new Node(Type.TERMINAL, 6, "parens2", ")"),
					new Node(Type.TERMINAL, 7, "semi", ";"),
					new Node(Type.TERMINAL, 8, "equal", "="),
					new Node(Type.TERMINAL, 9, "int", "int"),
					new Node(Type.TERMINAL, 10, "float", "float"),
					new Node(Type.TERMINAL, 11, "string", "String"),
					new Node(Type.TERMINAL, 12, "id"),
					new Node(Type.TERMINAL, 13, "bracket1", "["),
					new Node(Type.TERMINAL, 14, "bracket2", "]"),
					new Node(Type.TERMINAL, 15, "aster", "*"),
					new Node(Type.TERMINAL, 16, "comma", ","),
					new Node(Type.TERMINAL, 17, "kwdclass", "class"),
					new Node(Type.TERMINAL, 18, "colon", ":"),
					new Node(Type.TERMINAL, 19, "kwdfcn", "function"),
					new Node(Type.TERMINAL, 20, "kwdif", "if"),
					new Node(Type.TERMINAL, 21, "kwdelseif", "else if"),
					new Node(Type.TERMINAL, 22, "kwdelse", "else"),
					new Node(Type.TERMINAL, 23, "kwdwhile", "while"),
					new Node(Type.TERMINAL, 24, "kprint", "print"),
					new Node(Type.TERMINAL, 25, "kwdreturn", "return"),
					new Node(Type.TERMINAL, 26, "ampersand", "&"),
					new Node(Type.TERMINAL, 27, "opeq", "=="),
					new Node(Type.TERMINAL, 28, "opne", "!="),
					new Node(Type.TERMINAL, 29, "ople", "<="),
					new Node(Type.TERMINAL, 30, "opge", ">="),
					new Node(Type.TERMINAL, 31, "angle1", "<"),
					new Node(Type.TERMINAL, 32, "angle2", ">"),
					new Node(Type.TERMINAL, 33, "plus", "+"),
					new Node(Type.TERMINAL, 34, "minus", "-"),
					new Node(Type.TERMINAL, 35, "slash", "/"),
					new Node(Type.TERMINAL, 36, "caret", "^"),
					new Node(Type.TERMINAL, 37, "eof", "$")
				};
		symbols = new LinkedList<>(Arrays.asList(arrSym));
	}
	
	public LinkedList<Node> getList() {
		return symbols;
	}
}
