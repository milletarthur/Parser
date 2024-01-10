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
		String string = new String();
		string += Pretty.type(format, type);
		string += var.pretty(d);
		string += Pretty.separator(format, ";");
		return string;
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
