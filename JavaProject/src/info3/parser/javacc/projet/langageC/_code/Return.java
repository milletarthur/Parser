package info3.parser.javacc.projet.langageC._code;


public class Return extends Tree implements ITree {

	Tree expr;

	public Return(Tree expr) {
		this.expr = expr;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += Pretty.identifier(format, "return ");
		string += expr.pretty(d+1);
		string += Pretty.identifier(format, ";");
		return string;
	}

	// CFG

	@Override
	public String cfg(int src, int __, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

	// INFORMATION

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}
}
