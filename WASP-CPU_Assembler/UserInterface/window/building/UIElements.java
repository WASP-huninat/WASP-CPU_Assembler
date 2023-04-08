package window.building;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import main.WASP_CPU_Assembler;

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
	
	public static JTextArea create_TextArea(JTextArea TextAreaName, boolean LineWarp, boolean Eadibel, ArrayList<Object> addToBackground) {
		TextAreaName = new JTextArea();
		TextAreaName.setLineWrap(LineWarp);
		TextAreaName.setEditable(Eadibel);
		TextAreaName.setFont(new Font("", 0, 15));
		JScrollPane ScrollPaneName = new JScrollPane(TextAreaName);
		ScrollPaneName.setBorder(null);
		ScrollPaneName.setBackground(null);
		addToBackground.add(ScrollPaneName);
		return TextAreaName;
	}

	public static JPanel create_GridLayoutPanel(JPanel PanelName, int[] gridDimention, ArrayList<Object> addToBackground, WASP_CPU_Assembler window) {
		PanelName = new JPanel();
		PanelName.setLayout(new GridLayout(gridDimention[0], gridDimention[1]));
		for (int i = 0 ; i < addToBackground.size(); i++) {
			PanelName.add((Component) addToBackground.get(i));
		}
		window.add(PanelName);
		return PanelName;
	}

	public static JPanel create_PanelWithNoLayout(JPanel PanelName, Color BackgroundColor, WASP_CPU_Assembler window, ArrayList<Object> addToBackground) {
		PanelName = new JPanel();
		PanelName.setBackground(BackgroundColor);
		addToBackground.add(PanelName);
		window.add(PanelName);
		return PanelName;
	}
}