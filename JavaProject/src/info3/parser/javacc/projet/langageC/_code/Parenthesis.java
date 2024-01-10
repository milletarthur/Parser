package info3.parser.javacc.projet.langageC._code;

public class Parenthesis extends Tree implements ITree {

	Tree content;

	public Parenthesis(Tree content) {
		this.content = content ;
	}

	// PRETTY

	/* @........ */

	public String pretty(int d) {
		String string = new String();
		//string += newline(d);
		string += Pretty.string(format, "(");
		string += content.pretty(d);
		string += Pretty.string(format, ")");
		return string;
	}
}
