package Package;

import java.awt.*;
import javax.swing.*;

public class Printer extends JFrame {

	private JPanel Panel;

	public static void main(String[] args) {
		Printer imp = new Printer();
		imp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imp.setBounds(100, 100, 530, 230);
		imp.setVisible(true);
	}

	public Printer() {
		super("Printer");
		Panel = new JPanel();
		setContentPane(Panel);
		Panel.setLayout(null);

		JTextField textField1 = new JTextField();
		textField1.setBounds(25, 50, 75, 90);
		Panel.add(textField1);
		textField1.setColumns(10);

		JTextField textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(170, 50, 55, 90);
		Panel.add(textField2);
		
		JTextField textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(320, 50, 75, 90);
		Panel.add(textField3);
		
		JRadioButton radio1 = new JRadioButton("Selection");
		radio1.setBounds(235, 50, 80, 25);
		Panel.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("All");
		radio2.setBounds(235, 80, 80, 25);
		Panel.add(radio2);

		JRadioButton radio3 = new JRadioButton("Applet");
		radio3.setBounds(235, 110, 80, 25);
		Panel.add(radio3);

		JCheckBox check1 = new JCheckBox("Image");
		check1.setBounds(105, 50, 60, 25);
		Panel.add(check1);

		JCheckBox check2 = new JCheckBox("Text");
		check2.setBounds(105, 80, 60, 25);
		Panel.add(check2);

		JCheckBox check3 = new JCheckBox("Code");
		check3.setBounds(105, 110, 60, 25);
		Panel.add(check3);
		
		JCheckBox check4 = new JCheckBox("Print to File");
		check4.setBounds(255, 155, 100, 20);
		Panel.add(check4);

		JLabel label1 = new JLabel("Printer: My Printer");
		label1.setBounds(55, 25, 110, 15);
		Panel.add(label1);

		JLabel label2 = new JLabel("Print Quality:");
		label2.setBounds(70, 155, 83, 14);
		Panel.add(label2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "High", "Medium", "Low" }));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(155, 155, 80, 20);
		Panel.add(comboBox);

		JButton button1 = new JButton("OK");
		button1.setBounds(415, 20, 80, 25);
		Panel.add(button1);

		JButton button2 = new JButton("Cancel");
		button2.setBounds(415, 60, 80, 25);
		Panel.add(button2);

		JButton button3 = new JButton("Setup...");
		button3.setBounds(415, 100, 80, 25);
		Panel.add(button3);

		JButton button4 = new JButton("Help");
		button4.setBounds(415, 140, 80, 25);
		Panel.add(button4);
	}
}
