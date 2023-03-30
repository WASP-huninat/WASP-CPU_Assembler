package wasp.syntax;

import javax.swing.JTextArea;

public class Gen2Syntax {
	
	private static String I;
	
	public static String main(String OP, String reg, JTextArea OutTextAreaName) {
//		System.out.printf(z + "	");
//		z ++;
		if(OP.equals("NOP"))	return I = "0000 0000 0000 0000";
		//if(OP.equals(""))	return I = "";
		
	// Jumps
		if(OP.equals("JAU"))	return I = reg + " 000 0001 0001";
		if(OP.equals("JAZ"))	return I = reg + " 000 0001 0010";
		if(OP.equals("JAN"))	return I = reg + " 000 0001 0011";
		if(OP.equals("JAP"))	return I = reg + " 000 0001 0100";
		if(OP.equals("JAC"))	return I = reg + " 000 0001 0101";
	// Load REGX/REGY
		if(OP.equals("LDI"))	return I = reg + " 0010 0001";
		if(OP.equals("WAI"))	return I = reg + "1 0010 0010";
		if(OP.equals("LDX"))	return I = reg + "0 0010 0011";
		if(OP.equals("LDY"))	return I = reg + "0 0010 0100";
		if(OP.equals("RFR"))	return I = "0" + reg + " 0010 0101";
		if(OP.equals("WTR"))	return I = "1" + reg + " 0010 0110";
		if(OP.equals("GIO"))	return I = reg + " 0010 0111";
	// ALU Operations
		if(OP.equals("ADD"))	return I = "0001 " + reg + " 0100 0001";
		if(OP.equals("SUB"))	return I = "0001 " + reg + " 0100 0010";
		if(OP.equals("AND"))	return I = "0001 " + reg + " 0100 0011";
		if(OP.equals("NAND"))	return I = "0001 " + reg + " 0100 0100";
		if(OP.equals("OR"))		return I = "0001 " + reg + " 0100 0101";
		if(OP.equals("NOR"))	return I = "0001 " + reg + " 0100 0110";
		if(OP.equals("XOR"))	return I = "0001 " + reg + " 0100 0111";
		if(OP.equals("XNOR"))	return I = "0001 " + reg + " 0100 1000";
		if(OP.equals("LLS"))	return I = "0001 " + reg + " 0100 1001";
		if(OP.equals("BLS"))	return I = "0001 " + reg + " 0100 1010";
		if(OP.equals("LRS"))	return I = "0001 " + reg + " 0100 1011";
		if(OP.equals("BRS"))	return I = "0001 " + reg + " 0100 1100";
	// I/O and RAM
		//if(OP.equals("RUI"))	return I = 
		//if(OP.equals("STD"))	return I = 
		//if(OP.equals("CRP"))	return I = 
		else OutTextAreaName.append("no matching instruction found");
		return I;
	}
}