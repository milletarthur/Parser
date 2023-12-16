package info3.parser.javacc.projet.langageC._code;

public class Assign extends Tree implements ITree {

	Tree location;
	Tree expression;

	// CONSTRUCTOR

	public Assign(Tree lhs, Tree rhs) {
		this.location = lhs;
		this.expression = rhs;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += location.pretty(d);
		string += Pretty.assignment(format, " = ");
		// TODO à compléter

		string += Pretty.separator(format, ";");
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
