import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock2 extends JFrame implements ActionListener{

	
	JLabel lblShowTime = new JLabel("");
	InheritMyTime imt = new InheritMyTime();
	
	public static void main(String[] args) {
		DigitalClock2 fr = new DigitalClock2();
		centerFrame(fr);
		fr.setVisible(true);
		
	}

	private static void centerFrame(DigitalClock2 fr) {
		// TODO Auto-generated method stub
		
	}
	
	public DigitalClock2() {
		
	}
	
}
