package info3.parser.javacc.projet.langageC._code;

public class Args extends Tree implements ITree {
	
	Tree fg,fd;
	
	public Args (Tree t1, Tree t2) {
		fg = t1;
		fd = t2;
	}
	
	@Override
	public String pretty(int d) {
		Expr fg_expr = (Expr) fg;
		String rv = new String();
		rv = fg_expr.pretty();
		if(fd != null) {
			rv += ",";
			rv += fd.pretty();
		}
		return rv;
	}
}