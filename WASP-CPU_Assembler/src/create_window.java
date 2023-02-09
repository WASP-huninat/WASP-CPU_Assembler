import javax.swing.*;

import wasp.action.listener.ExitButton;
import wasp.action.listener.MenuItem;
import wasp.component.listener.WindowResize;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.Duration;
import java.time.Instant;

public class create_window extends JFrame{
	
	public static void main(String[] args) {
		Instant start = Instant.now();
		create_window win = new create_window(500, 500);
		win.setVisible(true);
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
	}
	
	private static final long serialVersionUID = 1L;
	JLabel version;
	JButton exit;
	JPanel Background;
	
	JMenuBar control;
	JMenu chose_version;
	JMenuItem Gen_1;
	JMenuItem Gen_2;
	
	public create_window(int WindowWidth, int WindowHight) {
		this.setTitle("Assembler");
		this.setSize(WindowWidth, WindowHight);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dim.width-WindowWidth)/2, (dim.height-WindowHight)/2);
		
		chose_version = new JMenu("chose generation");
		
		Gen_1 = user_interface_elements.create_MenuItem(chose_version, Gen_1, "Gen_1");
		Gen_2 = user_interface_elements.create_MenuItem(chose_version, Gen_2, "Gen_2");
		
		new MenuItem(Gen_1, Color.LIGHT_GRAY, Gen_2, null, null, null, null);
		new MenuItem(Gen_2, Color.LIGHT_GRAY, Gen_1, null, null, null, null);
		
		exit = new JButton("exit");
		exit.setBackground(null);
		exit.setBorderPainted(false);
		
		control = new JMenuBar();
		control.add(chose_version);
		control.add(exit);
		control.setBackground(Color.white);
		this.add(control, BorderLayout.NORTH);
		
		Background = new JPanel();
		Background.setBackground(Color.DARK_GRAY);
		this.add(Background);
		
		new WindowResize(Background, exit);
		new ExitButton(exit);
	}
}