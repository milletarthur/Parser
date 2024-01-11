package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;

public class Decl extends Tree implements ITree {

	ArrayList<Tree> arrays;
	String type;
	Tree var;

	// CONSTRUCTOR

	public Decl(String type, Tree var, ArrayList<Tree> arrays) {
		this.type = type;
		this.var = var;
		this.arrays = arrays;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string += Pretty.type(format, type);
		string += var.pretty(d);
		string += Pretty.separator(format, ";");
		return string;
		// TODO pretty à finir pour les tableaux multidimensionnels
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
