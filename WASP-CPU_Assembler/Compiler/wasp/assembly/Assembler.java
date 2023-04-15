package wasp.assembly;

import javax.swing.JTextArea;

import wasp.syntax.Gen1Syntax;
import wasp.syntax.Gen2Syntax;

public class Assembler {
	private int z = 1;

	public Assembler(JTextArea InTextAreaName, JTextArea OutTextAreaName, SelectedAssembler selectedAssembler) {
		
// 		String[] lines =InTextAreaName.getText().split("\n");
//		for (int i = 0; i < lines.length; i++) {
//			String line = lines[i];
//			
//			String[] commands = line.split(",");
//			for (int j = 0; j < commands.length; j++) {
//				
//				String command = commands[j];
//				String[] tokens = command.split(" ");
//			}
//		}
		
		String[] byte1 = InTextAreaName.getText().split("\n");
		String[][] byte2 = new String[byte1.length][];
		for (int i = 0; i < byte2.length; i++) {
			String[] splitByte1AndByte2 = byte1[i].split(" ");
			byte2[i] = splitByte1AndByte2;
		}
		
		if (selectedAssembler.getSelectedAssembler() == 1) {
			for (int i = 0; i < byte2.length; i++) {
				OutTextAreaName.append(z + "	" + Gen1Syntax.main(byte2[i][0], byte2[i][1], OutTextAreaName) + "\n");
				z++;
			}
		}

		if (selectedAssembler.getSelectedAssembler() == 2) {
			for (int i = 0; i < byte2.length; i++) {
				OutTextAreaName.append(z + "	" + Gen2Syntax.main(byte2[i][0], byte2[i][1], OutTextAreaName) + "\n");
				z++;
			}
		}
	}
}