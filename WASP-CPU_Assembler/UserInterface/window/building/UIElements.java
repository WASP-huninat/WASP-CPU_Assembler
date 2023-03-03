package window.building;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

public class UIElements {
	
	public static JButton create_Button(JButton ButtonName, String VisibleButtonName, Color BackgroundColor, boolean Border) {
		ButtonName = new JButton(VisibleButtonName);
		ButtonName.setBackground(BackgroundColor);
		ButtonName.setBorderPainted(Border);
		return ButtonName;
	}
	
	public static JMenu create_Menu(JMenu MenuName, String VisibleMenuName, ArrayList<JMenu> addMenusToMenuBar) {
		MenuName = new JMenu(VisibleMenuName);
		addMenusToMenuBar.add(MenuName);
		return MenuName;
	}
	
	public static JMenuBar create_MenuBar(JMenuBar MenuBarName, Color BackgroundColor ,ArrayList<JMenu> addMenusToMenuBar, JButton GluedToRight) {
		MenuBarName = new JMenuBar();
		MenuBarName.setBackground(BackgroundColor);
		for(int i = 0; i<addMenusToMenuBar.size() ; i++) {
			MenuBarName.add((JMenu) addMenusToMenuBar.get(i));
		}
		MenuBarName.add(Box.createHorizontalGlue());
		MenuBarName.add(GluedToRight);
		return MenuBarName;
	}
	
	public static JMenuBar create_MenuBar(JMenuBar MenuBarName, Color BackgroundColor ,ArrayList<JMenu> addMenusToMenuBar) {
		MenuBarName = new JMenuBar();
		MenuBarName.setBackground(BackgroundColor);
		for(int i = 0; i<addMenusToMenuBar.size() ; i++) {
			MenuBarName.add((JMenu) addMenusToMenuBar.get(i));
		}
		return MenuBarName;
	}
	
	public static JMenuItem create_MenuItem(JMenuItem MenuItemName, String VisibleMenuItemName, JMenu MenuName, ArrayList<JMenuItem> MenuItems) {
		MenuItemName = new JMenuItem(VisibleMenuItemName);
		MenuItems.add(MenuItemName);
		return MenuName.add(MenuItemName);
	}
	
	
	
	public static JTextArea create_TextArea(JTextArea TextAreaName, boolean LineWarp, boolean Eadibel) {
		TextAreaName = new JTextArea();
		TextAreaName.setLineWrap(LineWarp);
		TextAreaName.setEditable(Eadibel);
		return TextAreaName;
	}
}