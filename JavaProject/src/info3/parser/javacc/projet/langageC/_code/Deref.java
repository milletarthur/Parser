package info3.parser.javacc.projet.langageC._code;

public class Deref extends Tree implements ITree {

	Tree location;

	public Deref(Tree location) {
		this.location = location;
	}

	// PRETTY

	public String pretty(int d) {
		String string = new String();
		string += Pretty.unop(format, "*");
		string += location.pretty(d);
		return string;
	}

}
