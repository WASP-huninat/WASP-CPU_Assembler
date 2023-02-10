package wasp.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

public class MenuItem{
	public MenuItem(JMenuItem ThisButton, Color ColorAfterClicking, ArrayList<JMenuItem> JMenuItems) {
		
		ThisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int i = 0; i < JMenuItems.size();i++) {
					JMenuItems.get(i).setBackground(null);
				}
				
				ThisButton.setBackground(ColorAfterClicking);
			}
		});
	}
}