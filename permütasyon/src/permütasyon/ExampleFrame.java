package permütasyon;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExampleFrame extends JFrame implements ActionListener {
	public static final int FRAME_POSITION_X = 0;
	public static final int FRAME_POSITION_Y = 0;
	public static final int FRAME_SIZE_X = 300;
	public static final int FRAME_SIZE_Y = 120;

	public static final String FRAME_TITLE = "F";
	
	JButton btnCalcP;
	JTextField txtN;
	JTextField txtR;
	JLabel lblP;
	
	int n=0;
	int r=0;
	
	public ExampleFrame(String title) {
		super(title);
		createComponents();
	}
	private void createComponents() {
		setLayout(null);
		MainPanel mainPanel = new MainPanel();
		add(mainPanel);
		
		lblP = new JLabel("N");
		lblP.setBounds(10,10, lblP.getPreferredSize().width, lblP.getPreferredSize().height);
		mainPanel.add(lblP);
		
		txtN = new JTextField(2);
		txtN.setBounds(30,10, txtN.getPreferredSize().width, txtN.getPreferredSize().height);
		mainPanel.add(txtN);
		
		lblP = new JLabel("R");
		lblP.setBounds(10,40, lblP.getPreferredSize().width, lblP.getPreferredSize().height);
		mainPanel.add(lblP);
		
		txtR = new JTextField(2);
		txtR.setBounds(30,40, txtR.getPreferredSize().width, txtR.getPreferredSize().height);
		mainPanel.add(txtR);
		
		lblP = new JLabel("P");
		lblP.setBounds(130,50, lblP.getPreferredSize().width, lblP.getPreferredSize().height);
		mainPanel.add(lblP);
		
		btnCalcP = new JButton("Calculate Permutation");
		btnCalcP.setBounds(80,10, btnCalcP.getPreferredSize().width, btnCalcP.getPreferredSize().height);
		mainPanel.add(btnCalcP);
		btnCalcP.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == btnCalcP) {
			n = Integer.parseInt(txtN.getText());
			r = Integer.parseInt(txtR.getText());
			int val = 1;
			if(n>0 && r>0 && n>=r) {
				val = calculatePermutation(n, r);
			}
			
			lblP.setText(val + "");
			lblP.setBounds(lblP.getLocation().x,lblP.getLocation().y, lblP.getPreferredSize().width, lblP.getPreferredSize().height);
			
		}
	}
	private int calculatePermutation(int n2, int r2) {
		int val = 1;
		for(int i=0;i<r2;i++) {
			val *= (n2-i);
		}
		return val;
	}
}
