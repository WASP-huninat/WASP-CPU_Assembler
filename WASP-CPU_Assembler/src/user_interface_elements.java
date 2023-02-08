

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class user_interface_elements {

	public static JMenuItem create_MenuItem(JMenu MenuName, JMenuItem ButtonName, String VisibleButtonName) {
		ButtonName = new JMenuItem(VisibleButtonName);
		return MenuName.add(ButtonName);
	}
}