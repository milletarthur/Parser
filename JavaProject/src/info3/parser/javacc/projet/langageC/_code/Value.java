package info3.parser.javacc.projet.langageC._code;

public class Value extends Tree implements ITree {

	String ident;
	Tree t2;

	public Value(String ident,Tree td) {
		this.ident = ident;
		this.t2=td;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String s = new String();
		s+=ident;
		s+=t2.pretty(d+1);
		return s;
	}
}
