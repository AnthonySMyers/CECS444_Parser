import java.util.LinkedList;

public class A6_GrammarRules {
	private LinkedList<Node[]> rules;
	private AllNodes nodes;
	
	public A6_GrammarRules(){
		import java.util.LinkedList;

public class A6_GrammarRules {
	private LinkedList<Node[]> rules;
	private AllNodes nodes;
	
	public A6_GrammarRules(){
		Node[] rule1 = new Node[4];
		rule1[0] = nodes.kwdprog;
		rule1[1] = nodes.Vargroup;
		rule1[2] = nodes.Fcndefs;
		rule1[3] = nodes.Main;
		
		Node[] rule2 = new Node[2];
		rule2[0] = nodes.kwdmain;
		rule2[1] = nodes.BBlock;
		
		Node[] rule3 = new Node[4];
		rule3[0] = nodes.brace1;
		rule3[1] = nodes.Vargroup;
		rule3[2] = nodes.Stmts;
		rule3[3] = nodes.brace2;
		
		Node[] rule4 = new Node[2];
		rule4[0] = nodes.kwdvars;
		rule4[1] = nodes.PPvarlist;
		
		Node[] rule5 = new Node[1];
		rule5[0] = null;
		
		Node[] rule6 = new Node[3];
		rule6[0] = nodes.parens1;
		rule6[1] = nodes.Varlist;
		rule6[2] = nodes.parens2;
		
		Node[] rule7 = new Node[3];
		rule7[0] = nodes.VarlItem;
		rule7[1] = nodes.semi;
		rule7[2] = nodes.Varlist;
		
		Node[] rule8 = new Node[1];
		rule8[0] = null;
		
		Node[] rule9 = new Node[2];
		rule9[0] = nodes.VarlDecl;
		rule9[1] = nodes.A;
		
		//rule10 crossed out on our rule/grammar list
		
		Node[] rule11 = new Node[2];
		rule11[0] = nodes.kwdclass;
		rule11[1] = nodes.VarlItemTail;
		
		//rule12 crossed out on our rule/grammar list
		
		Node[] rule13 = new Node[2];
		rule13[0] = nodes.Simplekind;
		rule13[1] = nodes.VarSpec;
		
		Node[] rule14 = new Node[1];
		rule14[0] = nodes.Basekind;
		
		Node[] rule15 = new Node[1];
		rule15[0] = nodes.Classid;
		
		Node[] rule16 = new Node[1];
		rule16[0] = nodes.Int;
		
		Node[] rule17 = new Node[1];
		rule17[0] = nodes.Float;
				
		Node[] rule18 = new Node[1];
		rule18[0] = nodes.string;
		
		Node[] rule19 = new Node[1];
		rule19[0] = nodes.id;
		
		Node[] rule20 = new Node[2];
		rule20[0] = nodes.id;
		rule20[1] = nodes.VarSpecTail;
		
		//rule21 crossed out on our rule/grammar list
		
		Node[] rule22 = new Node[1];
		rule22[0] = nodes.Deref_id;
		
		Node[] rule23 = new Node[1];
		rule23[0] = nodes.id;
		
		Node[] rule24 = new Node[2];
		rule24[0] = nodes.Varid;
		rule24[1] = nodes.KKint;
		
		Node[] rule25 = new Node[3];
		rule25[0] = nodes.bracket1;
		rule25[1] = nodes.Int;
		rule26[2] = nodes.bracket2;
		
		Node[] rule26 = new Node[2];
		rule26[0] = nodes.Deref;
		rule26[1] = nodes.id;
		
		Node[] rule27 = new Node[1];
		rule27[0] = nodes.aster;
		
		Node[] rule28 = new Node[1];
		rule28[0] = nodes.Expr;
		
		Node[] rule29 = new Node[1];
		rule29[0] = nodes.BBexprs;
		
		Node[] rule30 = new Node[2];
		rule30[0] = nodes.brace1;
		rule30[1] = nodes.BBexprsTail;
		
		
		
		
		Node[] rule73 = new Node[3];
		rule73[0] = nodes.Lval;
		rule73[1] = nodes.equal;
		rule73[2] = nodes.Expr;
		
		Node[] rule74 = new Node[1];
		rule74[0] = nodes.Varid;
		
		Node[] rule75 = new Node[1];
		rule75[0] = nodes.Aref;
		
		Node[] rule76 = new Node[1];
		rule76[0] = nodes.Deref_id;
		
		Node[] rule77 = new Node[2];
		rule77[0] = nodes.Varid;
		rule77[1] = nodes.KKexpr;
		
		Node[] rule78 = new Node[3];
		rule78[0] = nodes.bracket1;
		rule78[1] = nodes.Expr;
		rule78[2] = nodes.bracket2;
		
		Node[] rule79 = new Node[2];
		rule79[0] = nodes.Fcnid;
		rule79[1] = nodes.PPexprs;
		
		Node[] rule80 = new Node[3];
		rule80[0] = nodes.parens1;
		rule80[1] = nodes.Exprlist;
		rule80[2] = nodes.parens2;
		
		Node[] rule81 = new Node[1];
		rule81[0] = nodes.PPonly;
		
		Node[] rule82 = new Node[4];
		rule82[0] = nodes.kwdif;
		rule82[1] = nodes.PPexpr;
		rule82[2] = nodes.BBlock;
		rule82[3] = nodes.Elsepart;
		
		Node[] rule83 = new Node[4];
		rule83[0] = nodes.kwdelseif;
		rule83[1] = nodes.PPexpr;
		rule83[2] = nodes.BBlock;
		rule83[3] = nodes.Elsepart;
		
		Node[] rule84 = new Node[2];
		rule84[0] = nodes.kwdelse;
		rule84[1] = nodes.BBlock;
		
		Node[] rule85 = new Node[1];
		rule85[0] = null;
		
		Node[] rule86 = new Node[3];
		rule86[0] = nodes.kwdwhile;
		rule86[1] = nodes.PPexpr;
		rule86[2] = nodes.BBlock;
		
		Node[] rule87 = new Node[2];
		rule87[0] = nodes.kprint;
		rule87[1] = nodes.PPexprs;
		
		Node[] rule88 = new Node[2];
		rule88[0] = nodes.kwdreturn;
		rule88[1] = nodes.Expr;
		
		Node[] rule89 = new Node[1];
		rule89[0] = nodes.kwdreturn;
		
		Node[] rule90 = new Node[3];
		rule90[0] = nodes.parens1;
		rule90[1] = nodes.Expr;
		rule90[2] = nodes.parens2;
		
		Node[] rule91 = new Node[1];
		rule91[0] = nodes.Rterm;
		
		Node[] rule92 = new Node[1];
		rule92[0] = nodes.Term;
		
		Node[] rule93 = new Node[1];
		rule93[0] = nodes.Fact;
		
		Node[] rule94 = new Node[1];
		rule94[0] = nodes.Basekind;
		
		Node[] rule95 = new Node[1];
		rule95[0] = nodes.Lval;

		Node[] rule96 = new Node[1];
		rule96[0] = nodes.Addrof_id;

		Node[] rule97 = new Node[1];
		rule97[0] = nodes.Fcall;

		Node[] rule98 = new Node[1];
		rule98[0] = nodes.PPexpr;
		
		Node[] rule99 = new Node[2];
		rule99[0] = nodes.ampersand;
		rule99[1] = nodes.id;
		
		Node[] rule100 = new Node[1];
		rule100[0] = nodes.opeq;
		
		Node[] rule101 = new Node[1];
		rule101[0] = nodes.opne;
		
		Node[] rule102 = new Node[1];
		rule102[0] = nodes.Lthan;
		
		Node[] rule103 = new Node[1];
		rule103[0] = nodes.ople;
		
		Node[] rule104 = new Node[1];
		rule104[0] = nodes.opge;
		
		Node[] rule105 = new Node[1];
		rule105[0] = nodes.Gthan;

		Node[] rule106 = new Node[1];
		rule106[0] = nodes.angle1;
		
		Node[] rule107 = new Node[1];
		rule107[0] = nodes.angle2;
		
		Node[] rule108 = new Node[1];
		rule108[0] = nodes.plus;
		
		Node[] rule109 = new Node[1];
		rule109[0] = nodes.minus;
		
		Node[] rule110 = new Node[1];
		rule110[0] = nodes.aster;
		
		Node[] rule111 = new Node[1];
		rule111[0] = nodes.slash;
		
		Node[] rule112 = new Node[1];
		rule112[0] = nodes.caret;
		
		Node[] rule117 = new Node[1];
		rule117[0] = null;
		
		Node[] rule118 = new Node[2];
		rule118[0] = nodes.equal;
		rule118[1] = nodes.Varinit;
		
		Node[] rule119 = new Node[1];
		rule119[0] = nodes.ClassDefTail;
		
		Node[] rule120 = new Node[1];
		rule120[0] = null;
		
		Node[] rule121 = new Node[3];
		rule121[0] = nodes.Classmom;
		rule121[1] = nodes.Interfaces;
		rule121[2] = nodes.BBClassitems;
		
		Node[] rule122 = new Node[1];
		rule122[0] = null;
		
		Node[] rule123 = new Node[1];
		rule123[0] = nodes.KKint;
		
		Node[] rule124 = new Node[2];
		rule124[0] = nodes.Exprlist;
		rule124[1] = nodes.brace2;
		
		Node[] rule125 = new Node[1];
		rule125[0] = nodes.brace2;
		
		Node[] rule126 = new Node[1];
		rule126[0] = null;
		
		Node[] rule127 = new Node[2];
		rule127[0] = nodes.ClassgroupTail;
		rule127[1] = nodes.Classitems;
		
		Node[] rule128 = new Node[1];
		rule128[0] = nodes.Class_ctrl;
		
		Node[] rule129 = new Node[1];
		rule129[0] = nodes.VarlistTail;
		
		Node[] rule130 = new Node[2];
		rule130[0] = nodes.Mdheader;
		rule130[1] = nodes.Mddecls;
		
		Node[] rule131 = new Node[3];
		rule131[0] = nodes.VarlItem;
		rule131[1] = nodes.semi;
		rule131[2] = nodes.Varlist;
		
		Node[] rule132 = new Node[2];
		rule132[0] = nodes.Varspecs;
		rule132[1] = nodes.parens2;
		
		Node[] rule133 = new Node[1];
		rule133[0] = nodes.parens2;
		
		Node[] rule134 = new Node[1];
		rule134[0] = nodes.PPexprs;
		
		Node[] rule135 = new Node[2];
		rule135[0] = nodes.equal;
		rule135[1] = nodes.Expr;
		
		Node[] rule136 = new Node[1];
		rule136[0] = null;
		
		Node[] rule137 = new Node[1];
		rule137[0] = nodes.KKexpr;
		
		Node[] rule138 = new Node[2];
		rule138[0] = nodes.Exprlist;
		rule138[1] = nodes.parens2;
		
		Node[] rule139 = new Node[1];
		rule139[0] = nodes.parens2;
		
		Node[] rule140 = new Node[1];
		rule140[0] = nodes.Expr;
		
		Node[] rule141 = new Node[1];
		rule141[0] = null;
		
		Node[] rule142 = new Node[1];
		rule142[0] = null;
		
		Node[] rule143 = new Node[1];
		rule143[0] = nodes.KKexpr;
		
		Node[] rule144 = new Node[1];
		rule144[0] = nodes.PPexpr;
		
		
		rules.add(rule73);
		rules.add(rule74);
		rules.add(rule75);
		rules.add(rule76);
		rules.add(rule77);
		rules.add(rule78);
		rules.add(rule79);
		rules.add(rule80);
		rules.add(rule81);
		rules.add(rule82);
		rules.add(rule83);
		rules.add(rule84);
		rules.add(rule85);
		rules.add(rule86);
		rules.add(rule87);
		rules.add(rule88);
		rules.add(rule89);
		rules.add(rule90);
		rules.add(rule91);
		rules.add(rule92);
		rules.add(rule93);
		rules.add(rule94);
		rules.add(rule95);
		rules.add(rule96);
		rules.add(rule97);
		rules.add(rule98);
		rules.add(rule99);
		rules.add(rule100);
		rules.add(rule101);
		rules.add(rule102);
		rules.add(rule103);
		rules.add(rule104);
		rules.add(rule105);
		rules.add(rule106);
		rules.add(rule107);
		rules.add(rule108);
		rules.add(rule109);
		rules.add(rule110);
		rules.add(rule111);
		rules.add(rule112);
		rules.add(rule117);
		rules.add(rule118);
		rules.add(rule119);
		rules.add(rule120);
		rules.add(rule121);
		rules.add(rule122);
		rules.add(rule123);
		rules.add(rule124);
		rules.add(rule125);
		rules.add(rule126);
		rules.add(rule127);
		rules.add(rule128);
		rules.add(rule129);
		rules.add(rule130);
		rules.add(rule131);
		rules.add(rule132);
		rules.add(rule133);
		rules.add(rule134);
		rules.add(rule135);
		rules.add(rule136);
		rules.add(rule137);
		rules.add(rule138);
		rules.add(rule139);
		rules.add(rule140);		
		rules.add(rule141);
		rules.add(rule142);
		rules.add(rule143);
		rules.add(rule144);
	}
}
