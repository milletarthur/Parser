package info3.parser.javacc.projet.langageC._code;

public class Ident extends Tree implements ITree {

	String name;

	// CONSTRUCTOR

	public Ident(String name) {
		this.name = name;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String s = new String();
		s += Pretty.string(format, name);
		return s;
	}
}
