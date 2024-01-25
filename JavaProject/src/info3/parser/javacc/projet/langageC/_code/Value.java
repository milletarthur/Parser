package info3.parser.javacc.projet.langageC._code;

public class Value extends Tree implements ITree {

	Tree t1;
	Tree t2;

	public Value(Tree tu,Tree td) {
		this.t1=tu;
		this.t2=td;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String s = new String();
		s+=t1.pretty(d+1);
		s+=t2.pretty(d+1);
		return s;
	}
}
