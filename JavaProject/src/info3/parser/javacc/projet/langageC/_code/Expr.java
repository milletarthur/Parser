package info3.parser.javacc.projet.langageC._code;

public class Expr extends Tree implements ITree {
	
	Tree lhs;
	Tree rhs;
	
	public Expr (Tree t1, Tree t2) {
		lhs = t1;
		rhs = t2;
	}
	
	@Override
	public String pretty(int d) {
		String rv = new String();
		if(lhs != null) {
				rv += Pretty.string(format, "[");
				rv += lhs.pretty(d+1);
				rv += Pretty.string(format, "]");
		}
		rv += rhs.pretty(d+1);
		return rv;
	}
}
