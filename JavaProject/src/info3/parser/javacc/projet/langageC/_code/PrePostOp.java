package info3.parser.javacc.projet.langageC._code;

public class PrePostOp extends Tree implements ITree {

	String prepostop;
	Tree t1;
	Tree t2;
	
	public PrePostOp(String s) {
		this.prepostop = s;
		this.t1 = null;
		this.t2 = null;
	}
	
	public PrePostOp(Tree tr) {
		this.prepostop = null;
		this.t1 = tr;
		this.t2 =null;
	}
	
	public String pretty(int d) {
		String string = new String();
		if(this.t1 == null) {
			string += Pretty.string(format, prepostop);
		}else if(t1 != null && t2 == null){
			string += Pretty.string(format, "[");
			string += t1.pretty(d+1);
			string += Pretty.string(format, "]");
		}else if(t1 != null && t2 != null) {
			string += t1.pretty(d+1);
			string += t2.pretty(d+1);
		}
		return string;
	}
}
