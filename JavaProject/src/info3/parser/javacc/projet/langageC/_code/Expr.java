package info3.parser.javacc.projet.langageC._code;

public class Expr extends Tree implements ITree {
	
	Tree t;
	
	public Expr (Tree t) {
		this.t = t;
	}
	
	@Override
	public String pretty(int d) {
		return t.pretty(d+1);
	}
}
