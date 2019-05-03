package Package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints; // constraints of this layout

	public Calculadora() {
		super("Calculadora");
		layout = new GridBagLayout();
		setLayout(layout); // set frame layout
		constraints = new GridBagConstraints(); // instantiate constraints

		JTextField textField = new JTextField("");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttonDiv = new JButton("/");
		JButton buttonMul = new JButton("*");
		JButton buttonSub = new JButton("-");
		JButton buttonSom = new JButton("+");
		JButton buttonIg = new JButton("=");
		JButton buttonPon = new JButton(".");
		
		 
		   
		   constraints.fill = GridBagConstraints.BOTH;
		   constraints.weightx = 1;
		   constraints.weighty = 4; 
		   addComponent( textField, 0, 0, 4, 1);
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1; 
		   addComponent( button1, 1, 0, 1, 1 );      

		   constraints.weightx = 1;  
		   constraints.weighty = 1;     
		   addComponent( button2, 1, 1, 1, 1 );

		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button3, 1, 2, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonDiv, 1, 3, 1, 1 );

		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button4, 2, 0, 1, 1 );
		   
		   constraints.weightx = 1;  
		   constraints.weighty = 1;     
		   addComponent( button5, 2, 1, 1, 1 );

		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button6, 2, 2, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonMul, 2, 3, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button7, 3, 0, 1, 1 );
		   
		   constraints.weightx = 1;  
		   constraints.weighty = 1;     
		   addComponent( button8, 3, 1, 1, 1 );

		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button9, 3, 2, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonSub, 3, 3, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( button0, 4, 0, 1, 1 );
		   
		   constraints.weightx = 1;  
		   constraints.weighty = 1;     
		   addComponent( buttonPon, 4, 1, 1, 1 );

		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonIg, 4, 2, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonSom, 4, 3, 1, 1 );

	}

	private void addComponent(Component component, int row, int column, int width, int height) {
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints(component, constraints);
		add(component);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(300, 150); 
		calc.setVisible(true); 
	}

}
