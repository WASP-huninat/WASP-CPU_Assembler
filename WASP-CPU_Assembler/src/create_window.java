

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.Duration;
import java.time.Instant;

public class create_window extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		Instant start = Instant.now();
		create_window win = new create_window();
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
	
	public create_window() {
		this.setTitle("Assembler");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int window_width = this.getSize().width;
        int window_height = this.getSize().height;
        this .setLocation((dim.width-window_width)/2, (dim.height-window_height)/2);
		
		chose_version = new JMenu("chose generation");
		
		Gen_1 = user_interface_elements.create_MenuItem(chose_version, Gen_1, "Gen_1");
		Gen_2 = user_interface_elements.create_MenuItem(chose_version, Gen_2, "Gen_2");
		
		new handler_MenuItem(Gen_1, Gen_2);
		new handler_MenuItem(Gen_2, Gen_1);
		
		exit = new JButton("exit");
		exit.setBackground(null);
		exit.setBorderPainted(false);
		exit.addActionListener(this);
		
		control = new JMenuBar();
		control.add(chose_version);
		control.add(exit);
		control.setBackground(Color.white);
		this.add(control, BorderLayout.NORTH);
		
		Background = new JPanel();
		Background.setBackground(Color.DARK_GRAY);
		this.add(Background);
		
		

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		this.addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent e) {
				int width = Background.getWidth();
				exit.setLocation(width-56, 0);
		    }
		});
	}
	public void actionPerformed(ActionEvent e) {
	}
}