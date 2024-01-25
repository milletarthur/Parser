package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;

public class Call extends Tree implements ITree {

	Tree fun;
	ArrayList<Tree> args;

	// CONSTRUCTOR

	public Call(Tree t, ArrayList<Tree> ts) {
		this.fun = t;
		this.args = ts;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		{
			String s = new String();
			s += fun.pretty(d + 1);
			s += "(";
			int argnum = 0;
			for (Tree arg : args) {
				if (argnum != 0)
					s += ", ";
				s += arg;
				argnum++;
			}
			s += ")";
			return s;
		}
	}

}
