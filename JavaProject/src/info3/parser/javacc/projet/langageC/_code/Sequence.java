package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;
import java.util.Iterator;
import info3.shared.Dot;

public class Sequence extends Tree implements ITree {

	ArrayList<Tree> statements;

	// CONSTRUCTOR

	public Sequence(ArrayList<Tree> trees) {
	}

	// PREDICATE

	@Override
	public boolean isEmpty() {
		// TODO à modifier
		return false;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		for (Tree statement : statements) {
			// TODO à compléter
		}
		return string;
	}

	// CFG (***)

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

	// CFG (***)

	@Override
	public String cfg(int src, int target, int exit) {
		if (isEmpty()) {
			// TODO à modifier
			{
				return null;
			}
		} else {
			String string = new String();
			Tree statement, next_statement;
			Iterator<Tree> iterator = statements.iterator();
			statement = iterator.next();
			while (true) {
				// TODO à modifier
				{
					return null;
				}
			}
		}
	}

}
