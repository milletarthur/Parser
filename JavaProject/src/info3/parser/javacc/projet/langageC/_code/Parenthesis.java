package info3.parser.javacc.projet.langageC._code;

public class Parenthesis extends Tree implements ITree {
	Tree t;
	
	public Parenthesis(Tree t) {
		this.t = t;
	}
	
	@Override
	public String pretty(int d) {
		String s = new String();
		s += Pretty.string(format, "(");
		s += t.pretty(d);
		s += Pretty.string(format, ")");
		return s;
	}
}
