package info3.parser.javacc.projet.langageC._code;

public class PreUnop extends Tree implements ITree {

	String op;
	Tree expr;

	// CONSTRUCTOR

	public PreUnop(String s, Tree t) {
		this.op = s;
		this.expr = t;
	}

	// PRETTY

	// TODO à compléter

}
