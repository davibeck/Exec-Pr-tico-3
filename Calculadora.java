package Package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints; // constraints of this layout
	boolean c = false;
	int v1 = 0, v2 = 0;
	String op;

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
		JButton buttonx = new JButton("x!");
		JButton buttonln = new JButton("e^x");
		JButton buttonRaiz = new JButton("raiz 2");
		JButton buttonRaizc = new JButton("raiz 3");
		JButton buttonPor = new JButton("%");
		JButton buttonQua = new JButton("x^2");
		JButton buttonCub = new JButton("x^3");
		JButton buttonxy = new JButton("x^y");
		JButton buttonPi = new JButton("Pi");
		JButton clear = new JButton("C");
		JButton buttonPD = new JButton("(");
		JButton buttonPE = new JButton(")");
		
		
		
	
		
		button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	
            	if(!c) {
            		v1 = 1;
            		c = true;
            	}else {
            		v2 = 1;
            	}
            }
        });
		
		button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 2;
            		c = true;
            	}else {
            		v2 = 2;
            	}
            }
        });
		
		button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 3;
            		c = true;
            	}else {
            		v2 = 3;
            	}
            }
        });
		
		button4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 4;
            		c = true;
            	}else {
            		v2 = 4;
            	}
            }
        });
		
		button5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 5;
            		c = true;
            	}else {
            		v2 = 5;
            	}
            }
        });
		
		button6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 6;
            		c = true;
            	}else {
            		v2 = 6;
            	}
            }
        });
		
		button7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 7;
            		c = true;
            	}else {
            		v2 = 7;
            	}
            }
        });
      
		button8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 8;
            		c = true;
            	}else {
            		v2 = 8;
            	}
            }
        });
		   
		button9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 9;
            		c = true;
            	}else {
            		v2 = 9;
            	}
            }
        });
		
		button0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	if(!c) {
            		v1 = 0;
            		c = true;
            	}else {
            		v2 = 0;
            	}
            }
        });
		
		buttonDiv.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonMul.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonSub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonSom.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonIg.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonPon.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonx.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonln.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonRaiz.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		
		buttonRaizc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonPor.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonQua.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonCub.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonxy.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		buttonPi.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	op = "/";
            }
        });
		
		clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	
            }
        });
		
		buttonPD.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	
            }
        });
		
		buttonPE.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
            	
            }
        });
		
		   constraints.fill = GridBagConstraints.BOTH;
		   constraints.weightx = 1;
		   constraints.weighty = 4; 
		   addComponent( textField, 0, 0, 7, 1);
		   		   
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
		   addComponent( buttonx, 1, 4, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonPor, 1, 5, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonPi, 1, 6, 1, 1 );

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
		   addComponent( buttonln, 2, 4, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonQua, 2, 5, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( clear, 2, 6, 1, 1 );
		   
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
		   addComponent( buttonRaiz, 3, 4, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonCub, 3, 5, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonPD, 3, 6, 1, 1 );
		   
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
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonRaizc, 4, 4, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonxy, 4, 5, 1, 1 );
		   
		   constraints.weightx = 1;
		   constraints.weighty = 1;    
		   addComponent( buttonPE, 4, 6, 1, 1 );

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
		calc.setSize(400, 250); 
		calc.setVisible(true); 
	}

}
