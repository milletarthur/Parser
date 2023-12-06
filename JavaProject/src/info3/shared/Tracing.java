package info3.shared;

public class Tracing extends Format {

	// FIELDS

	static boolean tracing_enabled;
	static boolean xterm_font_enabled;
	static Format format;

	// INITIALIZATION

	static {
		format = Format.TEXT;
		tracing_enabled = false;
		xterm_font_enabled = false;
	}

	// SETTINGS

	public static void enable_tracing(boolean b) {
		tracing_enabled = b;
	}

	public static void enable_xterm_font(boolean b) {
		xterm_font_enabled = b;
		if (xterm_font_enabled)
			format = Format.XTERM;
		else
			format = Format.TEXT;
	}

	// TRACING

	public static void trace(String string) {
		if (tracing_enabled)
			System.out.print(string);
	}

	public static void traceinBlink(String content) {
		trace(format.blink(content));
	}

	public static void traceinGray(String content) {
		trace(format.color(i_light_gray, content));
	}

	public static void traceinGreen(String content) {
		trace(format.color(i_bright_green, content));
	}

	public static void traceinCyan(String content) {
		trace(format.color(i_bright_cyan, content));
	}

	public static void traceinRed(String content) {
		trace(format.color(i_bright_red, content));
	}

	public static void traceinYellow(String content) {
		trace(format.color(i_bright_yellow, content));
	}

	// == INDENTATION

	public static void newline(int d) {
		trace(Format.make_newline("\n", d, format.fainted(format.color(i_light_gray, "| "))));
	}

	// == CALL

	public static void call(int d, String content) {
		newline(d);
		trace(format.bold(format.color(i_white, content + "→")));
	}

	public static void returns(int d, String call, String result) {
		newline(d);
		trace(format.bold(format.color(i_bright_cyan, call + " returns " + result)));
	}

	// == PARSER

	public static void parsed(int d, String parser, String content) {
		newline(d);
		trace(format.bold(format.color(i_bright_green, parser + "✓")));
		trace(format.bold(format.color(i_white, ": ")));
		trace(format.color(i_bright_yellow,content));
	}

	public static void failed(int d, String parser, String content) {
		newline(d);
		trace(format.bold(format.color(i_bright_red, parser + "✗")));
		trace(format.bold(format.color(i_white, ": ")));
		trace(content);
	}

	// == LEXER

	public static void lexed(String content) {
		trace(format.italic(format.color(i_bright_blue, content)));
	}

	public static void token(String token, String content) {
		trace(format.bold(format.color(i_dark_yellow, " <" + token + " ")));
		lexed(content);
		trace(format.bold(format.color(i_dark_yellow, " > ")));
	}

	public static void consume_token(String token, String content) { // DEPRECATED
		token(token, content);
	}

}
