package info3.shared;

public class Dot {

	public static final String edge(String src, Format format, String label, String tgt, String options) {
		String the_options = (options != null) ? ", " + options : " ";
		if (format == Format.HTML)
			return String.format("\n  %s->%s [label=< %s >%s] ;", src, tgt, label, the_options);
		else
			return String.format("\n  %s->%s [label=\"%s\"%s] ;", src, tgt, label, the_options);
	}

	public static final String edge(int src, Format format, String label, int tgt) {
		if (label == null)
			return edge(String.format("%d", src), Format.HTML, "&epsilon;", String.format("%d", tgt), "color=red, fontcolor=red");
		else
			return edge(String.format("%d", src), format, label, String.format("%d", tgt), null);
	}

	public static final String digraph(String name, String body) {
		String string = new String();
		string += "digraph{";
		string += "\n node [shape=circle]";
		string += "\n fontname=\"Courier New\"";
		string += "\n" + name + "[shape=plain, fontcolor=blue]";
		string += "\n" + edge(name, Format.TEXT, "", "1", "color=blue");
		string += body;
		string += "\n}";
		return string;
	}

	public static final void toDotFile(String path, String filename, Format format, String content) {
		File.toFile(path, filename, "dot", content);
	}

}
