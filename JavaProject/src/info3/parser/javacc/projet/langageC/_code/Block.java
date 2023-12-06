package info3.parser.javacc.projet.langageC._code;

public class Block extends Tree implements ITree {

	Tree sequence;

	// CONSTRUCTOR

	public Block(Tree t) {
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
			// TODO à compléter
		} else {
			// TODO à compléter
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
