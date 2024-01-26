package info3.parser.javacc.projet.langageC._code;

public class Signage extends Tree implements ITree {
	
	String sign, pretype, type;
	
	public Signage(Token a, Token b, Token c) {
		if (a != null)
			this.sign = a.toString();
		else
			this.sign = null;
		if (b != null)
			this.pretype = b.toString();
		else
			this.pretype = null;
		this.type = c.toString();
	}
	
	@Override
	public String pretty(int d) {
		String s = new String();
		if (sign != null)
			s += Pretty.type(format, sign);
		if (pretype != null)
			s += Pretty.type(format, pretype);
		s += Pretty.type(format, type);
		return s;
	}
}
