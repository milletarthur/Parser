package info3.parser.javacc.projet.langageC._code;

public class PrePostOp extends Tree implements ITree {

	String prepostop;
	Tree t;
	
	public PrePostOp(String s) {
		this.prepostop = s;
		this.t = null;
	}
	
	public PrePostOp(Tree tr) {
		this.prepostop = null;
		this.t = tr;
	}
	
	public String pretty(int d) {
		String string = new String();
		if(this.t == null) {
			string += prepostop;
		}else {
			string += Pretty.string(format, "[");
			string += t.pretty(d);
			string += Pretty.string(format, "]");
		}
		
		return string;
	}
}
