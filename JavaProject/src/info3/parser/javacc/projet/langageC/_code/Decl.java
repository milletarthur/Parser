package info3.parser.javacc.projet.langageC._code;

public class Decl extends Tree implements ITree {

	String type;
	Tree var;

	// CONSTRUCTOR

	public Decl(String type, Tree var) {
		this.type = type;
		this.var = var;
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

}
