package info3.parser.javacc.projet.langageC._code;

public class Statement extends Tree implements ITree {

	Tree expr;

	// CONSTRUCTOR

	public Statement(Tree expr) {
		this.expr = expr;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		{
			return null;
		}
	}

	// CFG

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

}
