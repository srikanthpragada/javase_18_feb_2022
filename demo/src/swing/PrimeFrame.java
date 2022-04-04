package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeFrame extends JFrame {
	JTextField tfNumber;
	JButton btnPrime;
	JLabel lblResult;

	// Inner class
	class HandleButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String value = tfNumber.getText();
			try {
				int num = Integer.parseInt(value);
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						lblResult.setText("Not Prime!");
						return;
					}
				}
				lblResult.setText("Prime!");
			} catch (Exception ex) {
                lblResult.setText("Invalid Number!");
			}
		}
	}

	public PrimeFrame() {
		super("Prime Number Check"); // Title
		// Create swing components
		tfNumber = new JTextField(10);
		btnPrime = new JButton("Check Prime");
		lblResult = new JLabel("");
		lblResult.setHorizontalAlignment(JLabel.CENTER);
		lblResult.setForeground(Color.blue);
		lblResult.setFont(new Font("Calibri", Font.BOLD, 20));

		Container c = getContentPane();
		JPanel p = new JPanel();
		p.add(new JLabel("Number :"));
		p.add(tfNumber);

		c.add(p, BorderLayout.NORTH);
		c.add(btnPrime, BorderLayout.SOUTH);
		c.add(lblResult, BorderLayout.CENTER);
		btnPrime.addActionListener(new HandleButton());

	}

	public static void main(String[] args) {
		var pf = new PrimeFrame();
		pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pf.setSize(300, 200);
		pf.setVisible(true);
	}

}
