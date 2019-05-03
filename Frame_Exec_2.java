package Package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame_Exec_2 extends JFrame implements ActionListener {

	private JButton[] colorButtons = new JButton[3];
	private JButton[] drawButtons = new JButton[3];
	private BorderLayout border_Layout;
	public static Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel, boxColor, boxDraw;

	public Frame_Exec_2() {
		super("Demonstração Border Layout");

		// Panel
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		colorJPanel.setLayout(border_Layout);
		boxColor = new JPanel();
		boxColor.setLayout(new GridLayout(3, 1));
		boxDraw = new JPanel();
		boxDraw.setLayout(new GridLayout(1, 3));

		// Frame
		border_Layout = new BorderLayout(5, 5);
		setLayout(border_Layout);

		// ColorBox
		// Botoes de Cor
		// Botao Cor
		colorButtons[0] = new JButton("Cor");
		colorButtons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog(Frame_Exec_2.this, "Escolha uma cor", color);

				if (color == null)
					color = Color.LIGHT_GRAY;
			}
		});

		// Botao OK
		colorButtons[1] = new JButton("OK");
		colorButtons[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorJPanel.setBackground(color);
			}
		});

		// Botao Cancel
		colorButtons[2] = new JButton("Cancel");
		colorButtons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorJPanel.setBackground(Color.LIGHT_GRAY);
			}
		});

		boxColor.add(colorButtons[0]);
		boxColor.add(colorButtons[1]);
		boxColor.add(colorButtons[2]);

		// DrawBox
		// Botoes de Desenho
		// Botao +
		drawButtons[0] = new JButton("+");
		drawButtons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame_Draw.pointPlus();
			}
		});

		// Botao "-"
		drawButtons[1] = new JButton("-");
		drawButtons[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame_Draw.pointMinus();
			}
		});

		// Botao "Clear"
		drawButtons[2] = new JButton("Clear");
		drawButtons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame_Draw.pointCount = 0;
			}
		});

		boxDraw.add(drawButtons[0]);
		boxDraw.add(drawButtons[1]);
		boxDraw.add(drawButtons[2]);

		add(colorJPanel, BorderLayout.CENTER);
		Frame_Draw drawJPanel = new Frame_Draw();
		drawJPanel.setBackground(Color.WHITE);
		drawJPanel.setSize(300, 200);
		colorJPanel.add(drawJPanel, BorderLayout.CENTER);
		add(boxColor, BorderLayout.WEST);
		add(boxDraw, BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Frame_Exec_2 borderLayoutFrame = new Frame_Exec_2();
		borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayoutFrame.setSize(600, 200);
		borderLayoutFrame.setVisible(true);
	}

}