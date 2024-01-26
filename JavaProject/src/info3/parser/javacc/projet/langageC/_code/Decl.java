package info3.parser.javacc.projet.langageC._code;

import java.util.ArrayList;

public class Decl extends Tree implements ITree {

	ArrayList<Tree> T;
	String st;

	// CONSTRUCTOR
	
	public Decl(String s ,ArrayList<Tree> trees) {
		this.st=s;
		this.T=trees;
	}

	// PRETTY

	@Override
	public String pretty(int d) {
		String string = new String();
		string+=st;
		string+=Pretty.string(format, " ");
		if(T.size() !=0) {
			for(int i=0; i< T.size()-1;i++) {
				string+= T.get(i).pretty(d+1);
				string+= Pretty.separator(format, ",");
			}
			string += T.get(T.size()-1).pretty(d+1);
			string += Pretty.string(format, ";");
//			string += newline(d+1);
			return string;
		}else { //EOFEcxeption 
			System.out.println("/!\\ Decl : ArrayList n'a pas d'elem ce qui n'est pas normal ");
			return string;
		}
		
	}

	// CFG

	@Override
	public Tree first_instruction() {
		// TODO à modifier
		{
			return null;
		}
	}

}
