package info3.parser.javacc.projet.langageC._code;

public interface ITree {

	public boolean isEmpty();

	// PRETTY

	// [pretty] returns as a string the pretty source of the tree
	// with colors and indentation and line numbering

	public String pretty(int indentation);

	// CFG = CONTROL FLOW GRAPH

	// [cfg] returns as a string the encoding in dot of the control flow graph
	// (nodes and edages) of the tree
	// Each node of the control flow graph is named by the line number of the first
	// instruction of the statement.

	public String cfg(int src, int tgt, int exit);

	// INFORMATION

	// [first_instructon] find the first_instruction of the statements

	public Tree first_instruction();

}
