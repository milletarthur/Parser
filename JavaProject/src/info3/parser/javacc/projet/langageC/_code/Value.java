package info3.parser.javacc.projet.langageC._code;

public class Value extends Tree implements ITree {

	String ident;

	public Value(Token id) {
		this.ident = id.toString();
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		return ident;
	}
}
