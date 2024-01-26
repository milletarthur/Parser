package info3.parser.javacc.projet.langageC._code;

public class E1 extends Tree implements ITree {
	
	Tree pre, value, post;
	String ptr;
	
	// CONSTRUCTOR
	
	public E1(Tree pre, String ptr, Tree value, Tree post) {
		this.pre = pre;
		this.value = value;
		this.post = post;
		this.ptr = ptr;
	}
	
	@Override
	public String pretty(int d) {
		String string = new String();
		if (pre != null) {
			string += pre.pretty(d+1);
		}
		if (ptr != null) {
			string += Pretty.string(format, ptr);
		}
		string += value.pretty(d+1);
		if (post != null) {
			string += post.pretty(d+1);
		}
		return string;
	}
}
