package info3.parser.javacc.projet.langageC._code;

public class While extends Tree implements ITree {

	Tree cond;
	Tree body;

	public While(Tree cond, Tree body) {
		this.cond = cond;
		this.body = body;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		// TODO à modifier
		{
			return null;
		}
	}

	// CFG

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

	@Override
	public String cfg(int src, int tgt, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

}
