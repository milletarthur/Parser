package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;

import info3.shared.Format;
import info3.shared.Html;

public class Pretty extends Format {

	// FIELDS : NONE

	// CONSTRUCTOR : NONE (STATIC CLASS = MODULE)

	static int mod(int a, int p) {
		int r = a % p;
		if (r < 0)
			r += p;
		return r;
	}

	static int color_at_depth(int depth) {
		switch (mod(depth, 6)) {
		case 0:
			return i_white;
		case 1:
			return i_bright_cyan;
		case 2:
			return i_bright_yellow;
		case 3:
			return i_bright_green;
		case 4:
			return i_bright_magenta;
		case 5:
			return i_bright_red;
		default:
			return i_default;
		}
	}

	// CONCATENATE STRINGS separated by the given separator

	public static final String separated_by(ArrayList<String> strings, String separator) {
		String string = new String();
		Iterator<String> iterator = strings.iterator();
		if (strings.isEmpty()) {
			// TODO à modifier
			{
				return null;
			}
		} else
			while (true) {
				// TODO à modifier
				{
					return null;
				}
			}
	}

	// PRETTY : GIVEN

	public static String type(Format format, String content) {
		return format.bold(format.color(i_dark_red, content));
	}

	public static String keyword(int depth, Format format, String content) {
		return format.bold(format.color(color_at_depth(depth), content));
	}

	public static String identifier(Format format, String content) {
		return format.bold(format.color(i_default, content));
	}

	public static String string(Format format, String content) {
		return format.bold(format.color(i_dark_yellow, content));
	}

	public static String value(Format format, String content) {
		return format.bold(format.color(i_bright_yellow, content));
	}

	public static String struct(int depth, Format format, String content) {
		return format.bold(format.color(color_at_depth(depth), content));
	}

	public static String balanced(Format format, String content) {
		return format.color(i_bright_red, content);
	}

	public static String separator(Format format, String content) {
		return format.bold(content);
	}

	public static String binop(Format format, String content) {
		String operator = (format == Format.HTML) ? Html.operator(content) : content;
		return format.bold(format.color(i_bright_blue, operator));
	}

	public static String assignment(Format format, String content) {
		return content;
	}

	public static String unop(Format format, String content) {
		String operator = (format == Format.HTML) ? Html.operator(content) : content;
		return format.bold(format.color(i_bright_red, operator));
	}

	public static String line_number(Format format, String content) {
		return format.fainted(format.color(i_gray, content));
	}

	// NEWLINE with INDENTATION

	public static final String newline(int depth, Format format, int line_number) {
<<<<<<< HEAD
		throw new RuntimeException("NIY");
		// TODO
=======
		String string = new String();
		string += "\n";
		string += Pretty.line_number(format, Integer.toString(line_number));
		for(int i = 0; i < depth; i++) {
			string += "\t";
		}
		return string;
>>>>>>> refs/remotes/origin/ArthuretPierre
	}

}
