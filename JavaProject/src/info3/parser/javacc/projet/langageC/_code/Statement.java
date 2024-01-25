package info3.parser.javacc.projet.langageC._code;

public class Statement extends Tree implements ITree {

	Tree expr;
	String sc;

	// CONSTRUCTOR

	public Statement(Tree expr, Token sc) {
		this.expr = expr;
		if (sc!=null)
			this.sc = sc.toString();
		else
			this.sc = null;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += expr.pretty(d+1);
		if (sc != null)
			string += Pretty.separator(format, sc);
		return string;
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
