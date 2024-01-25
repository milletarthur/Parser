package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;

public class Args extends Tree implements ITree {
	
	ArrayList<Tree> args;
	
	public Args(ArrayList<Tree> args) {
		this.args = args;
	}
	
	@Override
	public String pretty(int d) {
		String s = new String();
		Iterator<Tree> iter = args.iterator();
		if (iter.hasNext()) {
			s += iter.next().toString();
			while (iter.hasNext()) {
				s += Pretty.separator(format, ",");
				s += iter.next().toString();
			}
		}
		return s;
	}
}