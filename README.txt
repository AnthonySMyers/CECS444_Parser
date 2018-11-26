CECS 444 Sec 01 5559
Project 2 - LL Parser for A6 Grammar
Team TBD
Minhkhoa Vu	minhkhoavu954@gmail.com
Anthony Myers	anthonysmyers@yahoo.com
Juan Espinoza	jaespin30@yahoo.com
Miguel Castorena miguel.angel.castorena@gmail.com

Introduction
This program takes .txt file that contains A6 Language code and produces a PST for the program.

Algorithm
N/A

Contents
A6_GrammarRules.java
AllNodes.java
LL_Table.java
Node.java
Parser.java
Type.java
README.txt

External Requirements
1. Java must be installed.
2. Must have a properly formatted .txt file with A6 Language code for tokenization

Setup and Installation
N/A

Sample Invocation and Results

Enter the path of the file: Untitled 1
Vargroup : 12
Stmts : 12
Stmt : 12
StmtTail : 12
[53, null]
M3E
ERROR
(Node: (Rule: Pgm = 'prog' Main )
	(Node: ('prog')
	(Node: (Rule: Main = 'main' BBlock )
		(Node: ('main')
		(Node: (Rule: BBlock = '{' Stmts '}' )
			(Node: ('{')
			(Node: (Rule: Stmts = Stmt ';' Stmts )
				(Node: (Rule: Stmt = 'null' StmtTail )
					(Node: ('null')
					(Node: (Rule: StmtTail = )
				(Node: (';')
				(Node: (Rule: Stmts = )
			(Node: ('}'))))

Enter the path of the file: Untitled 2
Vargroup : 12
Stmts : 12
Stmt : 12
Expr : 12
Rterm : 12
Term : 12
Fact : 12
Lval : 12
Varid : 12
PPexprsTail : 12
Exprlist : 12
Expr : 12
Rterm : 12
Term : 12
Fact : 12
Lval : 12
Varid : 12
Moreexprs : 12
[26, null]
M3E
ERROR

Enter the path of the file: Untitled 3
PPexprsTail : 12
Exprlist : 12
Expr : 12
Rterm : 12
Term : 12
Fact : 12
Lval : 12
Varid : 12
Moreexprs : 12
[26, null]
M3E
ERROR
(Node: (Rule: Pgm = 'prog' Main )
	(Node: ('prog')
	(Node: (Rule: Main = 'main' BBlock )
		(Node: ('main')
		(Node: (Rule: BBlock = '{' Stmts '}' )
			(Node: ('{')
			(Node: (Rule: Stmts = Stmt ';' Stmts )
				(Node: (Rule: Stmt = Stprint )
					(Node: (Rule: Stprint = 'print' PPexprs )
						(Node: ('print')
						(Node: (Rule: PPexprs = '(' PPexprsTail )
							(Node: ('(')
							(Node: (Rule: PPexprsTail = Exprlist ')' )
								(Node: (Rule: Exprlist = Expr Moreexprs )
									(Node: (Rule: Expr = Rterm )
										(Node: (Rule: Rterm = Term )
											(Node: (Rule: Term = Fact )
												(Node: (Rule: Fact = Lval )
													(Node: (Rule: Lval = Varid )
														(Node: (Rule: Varid = 'null' )
															(Node: ('null')
									(Node: (Rule: Moreexprs = )
								(Node: (')')
				(Node: (';')
				(Node: (Rule: Stmts = )
			(Node: ('}'))))


Features
This program takes A6 language code in .txt files and outputs a PST for that program.

Bugs
There is only one bug in the program. If the .txt file does not have the proper spacing between token values, 
the program will not run correctly. 
As long as the .txt file is properly formatted, the program will run with no errors.
