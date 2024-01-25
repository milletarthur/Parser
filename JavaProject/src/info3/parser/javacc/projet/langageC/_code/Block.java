package info3.parser.javacc.projet.langageC._code;

public class Block extends Tree implements ITree {

	Tree sequence;

	// CONSTRUCTOR

	public Block(Tree t) {
		this.sequence = t;
	}

	// PREDICATE

	@Override
	public boolean isEmpty() {
		// TODO à modifier
		return true;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		if (sequence.isEmpty()) {
			return string;
		} else {
			string += Pretty.string(format, "{");
			string += sequence.pretty(d+1);
			string += Pretty.string(format, "}");
		}
		return string;
	}

	// CFG

	@Override
	public String cfg(int src, int tgt, int exit) {
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
