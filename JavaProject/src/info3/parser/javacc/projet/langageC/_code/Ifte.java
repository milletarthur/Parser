package info3.parser.javacc.projet.langageC._code;

public class Ifte extends Tree implements ITree {

	Tree cond;
	Tree then_block;
	Tree else_block;

	// CONSTRUCTOR

	public Ifte(Tree cond, Tree then_block, Tree else_block) {
		this.cond = cond;
		this.then_block = then_block;
		this.else_block = else_block;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += Pretty.keyword(d+1,format, "if");
		string += Pretty.string(format, "(");
		string += cond.pretty(d+1);
		string += Pretty.string(format, ")");
		string += then_block.pretty(d+1);
		if (else_block != null && !else_block.isEmpty()) {
			string += Pretty.keyword(d+1,format,"else");
			string += else_block.pretty(d+1);
		}
		return string;
	}

	// CFG

	@Override
	public String cfg(int src, int target, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

}
