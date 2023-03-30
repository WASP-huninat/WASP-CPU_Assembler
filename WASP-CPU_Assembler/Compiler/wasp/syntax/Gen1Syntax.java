package wasp.syntax;

import javax.swing.JTextArea;

public class Gen1Syntax {
	
	private static String I;
	
	public static String main(String OP, String reg, JTextArea OutTextAreaName) {
//		int i = Integer.parseInt(reg);
//		if (i < 1)
	//Jumps
		if(OP.equals("JAU"))	return I = "000 " + reg + " 1";
		if(OP.equals("JAZ"))	return I = "010 " + reg + " 1";
		if(OP.equals("JAN"))	return I = "100 " + reg + " 1";
		if(OP.equals("JAP"))	return I = "110 " + reg + " 1";
	//ALU OPs
		if(OP.equals("ADD"))	return I = "000 " + reg + " 0";
		if(OP.equals("XOR"))	return I = "001 " + reg + " 0";
		if(OP.equals("SUB"))	return I = "010 " + reg + " 0";
		if(OP.equals("OR"))		return I = "011 " + reg + " 0";
		if(OP.equals("AND"))	return I = "100 " + reg + " 0";
	//ALU REGs
		if(OP.equals("LDX"))	return I = "101 " + reg + " 0";
		if(OP.equals("LDIY"))	return I = "110 " + reg + " 0";
		if(OP.equals("LDY"))	return I = "111 " + reg + " 0";
	//Port
		if(OP.equals("PLD"))	return I = "001 1111 1";
		if(OP.equals("PST"))	return I = "000 1111 1";
	//useless
		if(OP.equals("LDA"))	return I = "    " + reg + "  ";
		else OutTextAreaName.append("no matching instruction found");
		return I;
	}
}