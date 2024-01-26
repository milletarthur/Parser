package info3.parser.javacc.projet.langageC._code;

public class Assign extends Tree implements ITree {

	Tree location;
	String assign;
	Tree expression;

	// CONSTRUCTOR

	public Assign(Tree lhs, String assign, Tree rhs) {
		this.location = lhs;
		this.assign = assign;
		this.expression = rhs;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += location.pretty(d+1);
		string += Pretty.assignment(format, assign);
		string += expression.pretty(d+1);
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
