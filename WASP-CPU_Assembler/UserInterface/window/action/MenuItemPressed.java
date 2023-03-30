package window.action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import wasp.assembly.SelectedAssembler;

public class MenuItemPressed {
	
	public MenuItemPressed(JMenuItem ButtonName, Color ColorAfterClicking, ArrayList<JMenuItem> MenuItems, int i, SelectedAssembler selectedAssembler) {
		
		ButtonName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < MenuItems.size(); i++) {
					MenuItems.get(i).setBackground(null);
					}
				ButtonName.setBackground(ColorAfterClicking);
				selectedAssembler.setSelectedAssembler(i);
			}
		});
	}
}