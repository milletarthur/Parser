package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;
public class Signage extends Tree implements ITree {
	
	String sign, pretype, ptr, type;
	
	public Signage(Token a, Token b, Token c, ArrayList<Token> d) {
		if (a != null)
			this.sign = a.toString();
		else
			this.sign = null;
		if (b != null)
			this.pretype = b.toString();
		else
			this.pretype = null;
		this.type = c.toString() + " ";
		ptr = new String();
		Iterator<Token> iter = d.iterator();
		while (iter.hasNext()) {
			ptr += iter.next().toString();
		}
		
	}
	
	@Override
	public String pretty(int d) {
		String s = new String();
		if (sign != null)
			s += Pretty.type(format, sign);
		if (pretype != null)
			s += Pretty.type(format, pretype);
		s += Pretty.type(format, type);
		if (ptr != null)
			s+= Pretty.binop(format, ptr);
		return s;
	}
}
