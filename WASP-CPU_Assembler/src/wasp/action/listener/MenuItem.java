package wasp.action.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class MenuItem{
	public MenuItem(JMenuItem ThisButton, Color ColorAfterClicking, JMenuItem OtherButton1, JMenuItem OtherButton2, JMenuItem OtherButton3, JMenuItem OtherButton4, JMenuItem OtherButton5) {
		
		ThisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ThisButton.setBackground(ColorAfterClicking);
				OtherButton1.setBackground(null);
			}
		});
	}
}