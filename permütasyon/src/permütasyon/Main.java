package permütasyon;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		ExampleFrame window=new ExampleFrame(ExampleFrame.FRAME_TITLE);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(ExampleFrame.FRAME_POSITION_X, ExampleFrame.FRAME_POSITION_Y, ExampleFrame.FRAME_SIZE_X, ExampleFrame.FRAME_SIZE_Y);
		window.setVisible(true);
	}
}
