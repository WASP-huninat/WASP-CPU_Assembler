

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class handler_MenuItem{
	
	public handler_MenuItem(JMenuItem o1, JMenuItem o2) {
		
		o1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				o1.setBackground(Color.LIGHT_GRAY);
				o2.setBackground(null);
			}
		});
	}
}