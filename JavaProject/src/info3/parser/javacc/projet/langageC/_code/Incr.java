package info3.parser.javacc.projet.langageC._code;

public class Incr extends Tree implements ITree {
	String inc;
	
	public Incr(Token inc) {
		this.inc = inc.toString();
	}
	
	@Override
	public String pretty(int d) {
		return Pretty.unop(format, inc);
	}
}
