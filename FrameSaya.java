import javax.swing.*;
import java.awt.*;

class FrameSaya extends JFrame{

	public FrameSaya() {
		// Set frame size
		setTitle("Tugas UAS PBO");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
		changeBkColor();

		// make close method
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void changeBkColor() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
	}
}