package Package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame_Exec_2 extends JFrame implements ActionListener {

	private JButton[] colorButtons = new JButton[3];
	private JButton[] drawButtons = new JButton[3];
	private BorderLayout border_Layout;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel, drawJPanel, boxColor, boxDraw;

	// configura GUI e registra listeners de botão
	public Frame_Exec_2() {
		super("Demonstração Border Layout");

		// Panel
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		colorJPanel.setLayout(border_Layout);
		drawJPanel = new JPanel();
		drawJPanel.setBackground(Color.WHITE);
		drawJPanel.setSize(300, 200);
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
		drawButtons[0] = new JButton("OI");
		drawButtons[1] = new JButton("OI");
		
		boxDraw.add(drawButtons[0]);
		boxDraw.add(drawButtons[1]);
		
		add(colorJPanel, BorderLayout.CENTER);
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