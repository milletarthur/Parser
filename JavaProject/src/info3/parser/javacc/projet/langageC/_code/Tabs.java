package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;

public class Tabs extends Tree implements ITree {
	
	ArrayList<Tree> t;
	
	public Tabs(ArrayList<Tree> t) {
		this.t = t;		
	}
	
	@Override
	public String pretty(int d) {
		String s = new String();
		Iterator<Tree> iter = t.iterator();
		while (iter.hasNext()) {
			s += Pretty.separator(format, "[");
			s += iter.next().pretty(d);
			s += Pretty.separator(format, "]");
		}
		return s;
	}
}
