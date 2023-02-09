package wasp.component.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WindowResize {

	public WindowResize(JPanel window, JButton ThisButton) {
		
		window.addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent e) {
				int width = window.getWidth();
				ThisButton.setLocation(width-56, 0);
		    }
		});
	}
}