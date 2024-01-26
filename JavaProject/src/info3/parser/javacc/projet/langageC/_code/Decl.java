package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;

public class Decl extends Tree implements ITree {

	ArrayList<Tree> T;
	Tree s;

	// CONSTRUCTOR
	
	public Decl(Tree s ,ArrayList<Tree> trees) {
		this.s= s;
		this.T=trees;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		Iterator<Tree> iter = T.iterator();
		String string = new String();
		string += s.pretty(d);
		if(iter.hasNext())
			string += iter.next().pretty(d);
		while(iter.hasNext()) {
			string += Pretty.separator(format, ",");
			string += iter.next().pretty(d);
		}
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
