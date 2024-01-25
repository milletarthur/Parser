package info3.parser.javacc.projet.langageC._code;

public class Pointer extends Tree implements ITree  {

	String s;
	Tree t1;
	Tree t2;
	
	public Pointer(String st,Tree tu,Tree tde) {
		this.s=st;
		this.t1=tu;
		this.t2=tde;
	}
	
	public String pretty(int d) {
		String str = new String();
		if(s == null) {
			str+=s;
		}
		if(t1==null) {
			str+=t1.pretty(d+1);
		}
		if(t2 == null) {
			str+=t2.pretty(d+1);
		}
		return str;
	}
}
