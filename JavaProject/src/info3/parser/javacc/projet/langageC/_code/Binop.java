package info3.parser.javacc.projet.langageC._code;

public class Binop extends Tree implements ITree {

	Tree l, r;
	String op;

	public Binop(Tree l, Token op, Tree r) {
		this.l = l;
		this.op = op.toString();
		this.r = r;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String s = new String();
		s += l.pretty(d);
		s += Pretty.assignment(format, op);
		s += r.pretty(d);
		return s;
	}
}
