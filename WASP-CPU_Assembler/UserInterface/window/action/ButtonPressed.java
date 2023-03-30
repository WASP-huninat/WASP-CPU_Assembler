package window.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

import wasp.assembly.Assembler;
import wasp.assembly.SelectedAssembler;

public class ButtonPressed {
	
	public ButtonPressed(JButton ButtonName) {
		ButtonName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public ButtonPressed(JButton ButtonName, JTextArea InTextAreaName, JTextArea OutTextAreaName, SelectedAssembler selectedAssembler) {
		ButtonName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OutTextAreaName.setText(null);
				new Assembler(InTextAreaName, OutTextAreaName, selectedAssembler);
			}
		});
	}
}