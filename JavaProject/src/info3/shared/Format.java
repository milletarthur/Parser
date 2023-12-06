package info3.shared;

public class Format {

	// FIELDS : NONE

	// CONSTRUCTOR : AUTO

	// SHARED CONSTANTS

	public static final Format HTML, XTERM, TEXT;

	// INITIALIZATION

	static {
		HTML = new Html();
		XTERM = new Xterm();
		TEXT = new Format();
	}

	// SHARED CONSTANT COLOR

	public static final int i_light_gray = 0;
	public static final int i_dark_red = 1;
	public static final int i_dark_green = 2;
	public static final int i_dark_yellow = 3;
	public static final int i_dark_blue = 4;
	public static final int i_dark_magenta = 5;
	public static final int i_dark_cyan = 6;
	public static final int i_dark_gray = 7;
	public static final int i_black = 8;

	public static final int i_white = 10;
	public static final int i_bright_red = 11;
	public static final int i_bright_green = 12;
	public static final int i_bright_yellow = 13;
	public static final int i_bright_blue = 14;
	public static final int i_bright_magenta = 15;
	public static final int i_bright_cyan = 16;
	public static final int i_gray = 17;

	public static final int i_default = 18;

	// ESCAPE/PROTECT

	public static String quotedString(String content) {
		return "\"" + content + "\"";
	}

	// COLOR

	public String colorname(int __) { // TO BE DEFINED in subclasses
		return null;
	}
	
	public String color(int __, String content){ // TO BE DEFINED in subclasses
		return content;
	} 

	// FONT

	public String bold(String content) {
		return content;
	}

	public String italic(String content) {
		return content;
	}

	public String fainted(String content) {
		return content;
	}

	public String underlined(String content) {
		return content;
	}

	public String strikeout(String content) {
		return content;
	}

	public String blink(String content) {
		return content;
	}

	// INDENTATION

	public static String make_newline(String cr, int d, String space) {
		String string = new String();
		string += cr;
		for (int i = 0; i < d; i++)
			string += space;
		return string;
	}

	public String make_newline(int d) {
		return make_newline("\n", d," ");
	}

}