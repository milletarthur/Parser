package info3.parser.javacc.projet.langageC._code;

public class PrePostOp extends Tree implements ITree {

	String prepostop;
	
	public PrePostOp(String s) {
		this.prepostop = s;
	}
	
	public String pretty(int d) {
		String string = new String();
		string += prepostop;
		return string;
	}
}
