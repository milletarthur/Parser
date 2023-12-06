package info3.shared;

public class Html extends Format {

	// CONSTRUCTOR : NONE

	// CONSTANT

	final static String s_dark_gray = "darkgray";
	final static String s_dark_red = "darkred";
	final static String s_dark_green = "darkgreen";
	final static String s_dark_yellow = "goldenrod";
	final static String s_dark_blue = "darkblue";
	final static String s_dark_magenta = "darkmagenta";
	final static String s_dark_cyan = "darkcyan";

	final static String s_light_gray = "lightgray";
	final static String s_gray = "gray";

	final static String s_bright_red = "red";
	final static String s_bright_green = "green";
	final static String s_bright_yellow = "gold";
	final static String s_bright_blue = "blue";
	final static String s_bright_magenta = "magenta";
	final static String s_bright_cyan = "cyan";

	final static String s_white = "white";
	final static String s_black = "black";

	final static String s_default = s_black;

	// NOTATION

	public static final String operator(String name) {
		switch (name) {
		case ">=":
			return symbol("geq");
		case "<":
			return symbol("lt");
		case ">":
			return symbol("gt");
		case "<=":
			return symbol("leq");
		case "&":
			return symbol("amp");
		default:
			return name;
		}
	}

	static final String symbol(String name) {
		return "&" + name + ";";
	}

	String openingMark(String mark, String options) {
		if (options != null)
			return String.format("<%s %s>", mark, options);
		else
			return String.format("<%s>", mark);
	}

	String closingMark(String mark) {
		return String.format("</%s>", mark);
	}

	String env(String mark, String content) {
		return openingMark(mark, null) + content + closingMark(mark);
	}

	// COLORS

	@Override
	public String colorname(int color_number) {
		switch (color_number) {
		case i_light_gray:
			return s_light_gray;
		case i_dark_red:
			return s_dark_red;
		case i_dark_green:
			return s_dark_green;
		case i_dark_yellow:
			return s_dark_yellow;
		case i_dark_blue:
			return s_dark_blue;
		case i_dark_magenta:
			return s_dark_magenta;
		case i_dark_cyan:
			return s_dark_cyan;
		case i_dark_gray:
			return s_dark_gray;
		case i_black:
			return s_black;
		case i_white:
			return s_white;
		case i_bright_red:
			return s_bright_red;
		case i_bright_green:
			return s_bright_green;
		case i_bright_yellow:
			return s_bright_yellow;
		case i_bright_blue:
			return s_bright_blue;
		case i_bright_magenta:
			return s_bright_magenta;
		case i_bright_cyan:
			return s_bright_cyan;
		case i_gray:
			return s_gray;
		default:
			return s_default;
		}
	}
	// FONT FACE

	@Override
	public String bold(String content) {
		return env("B", content);
	}

	@Override
	public String italic(String content) {
		return env("I", content);
	}

	@Override
	public String fainted(String content) {
		return env("STRONG", content);
	}

	@Override
	public String underlined(String content) {
		return env("U", content);
	}

	@Override
	public String strikeout(String content) {
		return env("S", content);
	}

	@Override
	public String blink(String content) {
		return env("BLINK", content);
	}

	// FONT COLOR

	@Override
	public String color(int cnum, String content) {
		return openingMark("font", "color=" + quotedString(colorname(cnum))) + content + closingMark("font");
	}

	// INDENTATION

	@Override
	public String make_newline(int d) {
		return Format.make_newline("\n<BR>", d, "&nbsp;");
	}
	
	// TABLE
	
	public static String cell(String content, String options) {
		return "<TD " + options + ">" + content + "</TD>";
	}

	public static String row(String columns, String options) {
		return "<TR " + options + ">" + columns + "</TR>";
	}
	
	public static String table(String rows, String options) {
		return "<TABLE " + options + ">" + rows + "</TABLE>";
	}

	// EXPORT TO FILE
	
	public static void to_html_file(String path, String name, String content) {
		File.toFile(path, name, "html", content);
	}
}
