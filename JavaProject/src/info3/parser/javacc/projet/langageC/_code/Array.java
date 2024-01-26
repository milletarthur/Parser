package info3.parser.javacc.projet.langageC._code;

public class Array extends Tree implements ITree {
	
	Tree id,tab;
	
	public Array(Tree id, Tree tab) {
		this.id = id;
		this.tab = tab;
	}

	@Override
	public String pretty (int d) {
		String s = new String();
		s += id.pretty(d);
		if (tab != null)
			s += tab.pretty(d);
		return s;
	}
}
