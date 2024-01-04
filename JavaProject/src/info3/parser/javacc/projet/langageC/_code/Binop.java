package info3.parser.javacc.projet.langageC._code;

public class Binop extends Tree implements ITree {

	Tree lhs;
	Tree rhs;
	String op;

	public Binop(Tree lhs, String op, Tree rhs) {
		this.lhs = lhs;
		this.op = op;
		this.rhs = rhs;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		{
			return null;
		}
	}

}
