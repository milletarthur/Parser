package info3.parser.javacc.projet.langageC._code;

import info3.shared.Dot;
import info3.shared.Format;

public class Algorithm extends Tree implements ITree {

	String name;
	Tree block;

	public Algorithm(String name, Tree body) {
	}

	// PRETTY

	public String pretty(int d) { // GIVEN
		String string = new String();
		string += newline(d);
		string += Pretty.keyword(d + 1, format, "PROGRAM");
		string += String.format("(%s)", Pretty.identifier(format, name));
		string += block.pretty_with_line_number(d + 1);
		return string;
	}

	// PRINT

	public void print() { // GIVEN
		System.out.println(pretty_with_line_number(0));
	}

	// CFG (CONTROL FLOW GRAPH = AUTOMATON)

	String make_cfg() { // GIVEN
		int entry = line_number;
		int exit = global_last_line_number;
		return cfg(entry, exit, exit);
	}

	@Override
	public String cfg(int src, int tgt, int exit) {
		// TODO à modifier
		{
			return null;
		}
	}

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

	// TO DOT

	public void toDot(String path) { // GIVEN
		// DEBUGGING
		System.out.print("\nCFG as DOT EDGES:\n" + make_cfg() + "\n\n");
		// EXPORTING
		format = Format.HTML;
		Dot.toDotFile(path, name, format, Dot.digraph(name, make_cfg()));
	}
}
