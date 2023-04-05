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
		if(OP.equals("JAU"))	return I = "000 " + reg + " 0001 0000";
		if(OP.equals("JAZ"))	return I = "000 " + reg + " 0001 0001";
		if(OP.equals("JAN"))	return I = "000 " + reg + " 0001 0010";
		if(OP.equals("JAP"))	return I = "000 " + reg + " 0001 0011";
		if(OP.equals("JAC"))	return I = "000 " + reg + " 0001 0100";
	// Load and I/O
		if(OP.equals("LDI"))	return I = reg + " 1000 1000";
		if(OP.equals("WIA"))	return I = "0001 " + reg + " 0010 0000";
		if(OP.equals("LDX"))	return I = "0000 " + reg + " 0010 0001";
		if(OP.equals("LDY"))	return I = "0000 " + reg + " 0010 0010";
		if(OP.equals("RDI"))	return I = reg + " 0010 0011";
		if(OP.equals("WDO"))	return I = reg + " 0010 0100";
		if(OP.equals("WAO"))	return I = reg + " 0010 0101";
		if(OP.equals("GIO"))	return I = reg + " 0010 0110";
	// ALU Operations
		if(OP.equals("ADD"))	return I = "0001 " + reg + " 0100 0001";
		if(OP.equals("SUB"))	return I = "0001 " + reg + " 0100 0010";
		if(OP.equals("AND"))	return I = "0001 " + reg + " 0100 0011";
		if(OP.equals("NAND"))	return I = "0001 " + reg + " 0100 0100";
		if(OP.equals("OR"))	return I = "0001 " + reg + " 0100 0101";
		if(OP.equals("NOR"))	return I = "0001 " + reg + " 0100 0110";
		if(OP.equals("XOR"))	return I = "0001 " + reg + " 0100 0111";
		if(OP.equals("XNOR"))	return I = "0001 " + reg + " 0100 1000";
		if(OP.equals("LLS"))	return I = "0001 " + reg + " 0100 1001";
		if(OP.equals("BLS"))	return I = "0001 " + reg + " 0100 1010";
		if(OP.equals("LRS"))	return I = "0001 " + reg + " 0100 1011";
		if(OP.equals("BRS"))	return I = "0001 " + reg + " 0100 1100";
	// ROM (ICache Page swap)
		//if(OP.equals("RUI"))	return I = 
		//if(OP.equals("CRP"))	return I = 
		else OutTextAreaName.append("no matching instruction found");
		return I;
	}
}