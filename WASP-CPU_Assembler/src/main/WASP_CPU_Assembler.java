package main;

import javax.swing.*;

import wasp.assembly.SelectedAssembler;
import window.action.ButtonPressed;
import window.action.MenuItemPressed;
import window.building.UIElements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
	JButton exit, StartAssembly;
	JMenu chose_version;
	JMenuBar control;
	JMenuItem gen_1, gen_2;
	JPanel background, controllPannel;
	JSplitPane split;
	JTextArea textInput, textOutput;
	
	ArrayList<JMenuItem> MenuItems = new ArrayList<>();
	ArrayList<JMenu> addMenusToMenuBar = new ArrayList<>();
	ArrayList<Object> addToBackground = new ArrayList<>();
	
	int[] gridDimension = {1,3};
	
	SelectedAssembler selectedAssembler = new SelectedAssembler();
	
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
		
		textInput = UIElements.create_TextArea(textInput, true, true, addToBackground);
		controllPannel = UIElements.create_PanelWithNoLayout(controllPannel, Color.DARK_GRAY,  this, addToBackground);
		textOutput = UIElements.create_TextArea(textOutput, true, false, addToBackground);
		textOutput.setTabSize(2);
		
		StartAssembly = UIElements.create_Button(StartAssembly, "StartAssembly", Color.MAGENTA, false);
		
		controllPannel.add(StartAssembly);
		
		background = (JPanel) UIElements.create_GridLayoutPanel(background, gridDimension, addToBackground, this);
		
		new ButtonPressed(exit);
		
		new MenuItemPressed(gen_1, Color.LIGHT_GRAY, MenuItems, 1, selectedAssembler);
		new MenuItemPressed(gen_2, Color.LIGHT_GRAY, MenuItems, 2, selectedAssembler);
		
		new ButtonPressed(StartAssembly, textInput, textOutput, selectedAssembler);
	}
}