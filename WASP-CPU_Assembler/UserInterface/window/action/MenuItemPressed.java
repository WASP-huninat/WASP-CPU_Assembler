package window.action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

public class MenuItemPressed {
	
	public MenuItemPressed(JMenuItem ThisButton, Color ColorAfterClicking, ArrayList<JMenuItem> MenuItems) {
		
		ThisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < MenuItems.size(); i++) {
					MenuItems.get(i).setBackground(null);
					}
				ThisButton.setBackground(ColorAfterClicking);
			}
		});
	}
}