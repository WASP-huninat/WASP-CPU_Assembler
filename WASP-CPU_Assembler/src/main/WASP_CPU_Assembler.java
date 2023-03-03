package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import window.action.ButtonPressed;
import window.action.MenuItemPressed;
import window.building.UIElements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.time.Duration;
import java.time.Instant;

import java.util.ArrayList;
 
public class WASP_CPU_Assembler extends JFrame {
	
	public static void main(String[] args) {
		Instant start = Instant.now();
		WASP_CPU_Assembler win = new WASP_CPU_Assembler(600, 500);
		win.setVisible(true);
		Instant end = Instant.now();
		System.out.println("" + Duration.between(start, end));
	}
	
	private static final long serialVersionUID = 1L;
	JButton exit, test;
	JMenu chose_version;
	JMenuBar control;
	JMenuItem gen_1, gen_2;
	JPanel background, ControllPannel;
	JSplitPane split;
	JTextArea textInput, textOutput;
	
	ArrayList<JMenuItem> MenuItems = new ArrayList<>();
	ArrayList<JMenu> addMenusToMenuBar = new ArrayList<>();
	
	public WASP_CPU_Assembler(int WindowWidth, int WindowHight) {
		this.setTitle("Assembler");
		this.setSize(WindowWidth, WindowHight);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((dim.width-WindowWidth)/2, (dim.height-WindowHight)/2);
		
		chose_version = UIElements.create_Menu(chose_version, "chose_version", addMenusToMenuBar);
		
		gen_1 = UIElements.create_MenuItem(gen_1, "Gen_1", chose_version, MenuItems);
		gen_2 = UIElements.create_MenuItem(gen_2, "Gen_2", chose_version, MenuItems);
		
		exit = UIElements.create_Button(exit, "exit", null, false);
		
		control = UIElements.create_MenuBar(control, Color.WHITE, addMenusToMenuBar, exit);
		this.add(control, BorderLayout.NORTH);
		
		ControllPannel = new JPanel();
		
		test = UIElements.create_Button(test, "test", Color.MAGENTA, false);
		
		ControllPannel.add(test);
		
		textInput = UIElements.create_TextArea(textInput, true, true);
		textOutput = UIElements.create_TextArea(textOutput, true, false);
		
//		String t =  textInput.getText();
//		textOutput.setText(t);
		
		ControllPannel.setBackground(Color.DARK_GRAY);
		
		background = new JPanel();
		background.setBackground(Color.magenta);
		background.setLayout(new GridLayout(1, 3));
		background.add(textInput);
		background.add(ControllPannel);
		background.add(textOutput);
		this.add(background);
		
		new ButtonPressed(exit);
		
		new MenuItemPressed(gen_1, Color.LIGHT_GRAY, MenuItems);
		new MenuItemPressed(gen_2, Color.LIGHT_GRAY, MenuItems);
	}
}