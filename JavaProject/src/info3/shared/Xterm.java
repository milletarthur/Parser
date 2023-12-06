package info3.shared;

public class Xterm extends Format {

	// CONSTRUCTOR : NONE

	// CONSTANT

	public final static String s_dark_gray = "30";
	public final static String s_dark_red = "31";
	public final static String s_dark_green = "32";
	public final static String s_dark_yellow = "33";
	public final static String s_dark_blue = "34";
	public final static String s_dark_magenta = "35";
	public final static String s_dark_cyan = "36";

	public final static String s_light_gray = "37";
	public final static String s_gray = "90";

	public final static String s_bright_red = "91";
	public final static String s_bright_green = "92";
	public final static String s_bright_yellow = "93";
	public final static String s_bright_blue = "94";
	public final static String s_bright_magenta = "95";
	public final static String s_bright_cyan = "96";

	public final static String s_white = "97";
	public final static String s_black = "98";

	public final static String s_default = s_white;

	// NOTATION

	public String font(String font, String content) {
		return String.format("\033[%sm%s\033[0m", font, content);
	}

	public String modifier(String modifier, String content) {
		return String.format("\033[%sm%s\033[m", modifier, content);
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
		return modifier("1", content);
	}

	@Override
	public String italic(String content) {
		return modifier("3", content);
	}

	@Override
	public String fainted(String content) {
		return modifier("2", content);
	}

	@Override
	public String underlined(String content) {
		return modifier("4", content);
	}

	@Override
	public String strikeout(String content) {
		return modifier("9", content);
	}

	@Override
	public String blink(String content) {
		return modifier("5", content);
	}

	// FONT COLOR

	@Override
	public String color(int cnum, String content) {
		return modifier(colorname(cnum), content);
	}

}
