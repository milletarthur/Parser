package info3.parser.javacc.projet.langageC._code;

public class Value extends Tree implements ITree {

	String ident;

	public Value(Token ident) {
		this.ident = ident.toString();
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		return new String(ident);
	}
}
