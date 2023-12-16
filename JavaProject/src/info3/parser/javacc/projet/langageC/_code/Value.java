package info3.parser.javacc.projet.langageC._code;

public class Value extends Tree implements ITree {

	String content;

	public Value(String string) {
		this.content = string;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		return Pretty.value(format, content);
	}
}
