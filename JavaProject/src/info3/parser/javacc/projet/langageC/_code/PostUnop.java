package info3.parser.javacc.projet.langageC._code;

public class PostUnop extends Tree implements ITree {

	Tree operand;
	String op;

	// CONSTRUCTOR

	public PostUnop(Tree t, String s) {
		this.operand = t;
		this.op = s;
	}

	// PRETTY

	// TODO à compléter

}
