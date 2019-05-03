package Package;

import java.awt.BorderLayout;
import java.awt.Color;
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
	private JPanel colorJPanel;
	Box boxDraw = Box.createHorizontalBox();
    Box boxColor = Box.createVerticalBox();

	// configura GUI e registra listeners de botão
	public Frame_Exec_2() {
		super("Demonstração Border Layout");

		// Panel
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);

		// Frame
		border_Layout = new BorderLayout(5, 5);
		setLayout(border_Layout);

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
		
		//Botao OK
		colorButtons[1] = new JButton("OK");
		colorButtons[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorJPanel.setBackground(color);
			}
		});
		
		//Botao Cancel
		colorButtons[2] = new JButton("Cancel");
		colorButtons[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				colorJPanel.setBackground(Color.LIGHT_GRAY);
			}
		});
		
		boxColor.add(Box.createVerticalStrut( 25 ));
		boxColor.add(colorButtons[0]);
		boxColor.add(Box.createVerticalStrut( 25 ));
		boxColor.add(colorButtons[1]);
		boxColor.add(Box.createVerticalStrut( 25 ));
		boxColor.add(colorButtons[2]);
		
		add(colorJPanel, BorderLayout.CENTER);
		add(boxColor, BorderLayout.WEST);
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