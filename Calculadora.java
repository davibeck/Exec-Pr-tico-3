package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculadora extends JFrame implements ActionListener {
	private GridBagLayout layout; // layout of this frame
	private GridBagConstraints constraints; // constraints of this layout
	boolean c = true;
	double x = ' ';

	public Calculadora() {
		super("Calculadora");
		layout = new GridBagLayout();
		setLayout(layout); // set frame layout
		constraints = new GridBagConstraints(); // instantiate constraints
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		JTextField textField = new JTextField("");
		textField.setEditable(false);
		JButton[] numberButtons = new JButton[10];

		for (int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(i + "");
			numberButtons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent a) {
					if (c)
						textField.setText("");
					textField.setText(textField.getText() + a.getActionCommand());
					c = false;
				}
			});
		}
		
		JButton[] basicButtons = new JButton[4];

		basicButtons[0] = new JButton("/");
		basicButtons[1] = new JButton("*");
		basicButtons[2] = new JButton("-");
		basicButtons[3] = new JButton("+");
		
		for (int i = 0; i < basicButtons.length; i++) {
			basicButtons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent a) {
					c = false;
					textField.setText(textField.getText() + " " + a.getActionCommand() + " ");
				}
			});
		}
		
		JButton buttonIg = new JButton("=");
		JButton buttonPon = new JButton(".");
		JButton buttonx = new JButton("x!");
		JButton buttonExpo = new JButton("e^x");
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

		buttonPon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				c = false;
				textField.setText(textField.getText() + a.getActionCommand());
			}
		});

		buttonx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(fat(resp) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
				;
			}
		});

		buttonExpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(Math.exp(resp) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(Math.sqrt(resp) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonRaizc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(Math.cbrt(resp) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(resp / 100 + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(Math.pow(resp, 2) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonCub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					textField.setText(Math.pow(resp, 3) + "");
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
					x = resp;
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		buttonPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (c)
					textField.setText("");
				textField.setText(textField.getText() + Math.PI);
			}
		});

		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				textField.setText("");
			}
		});

		buttonPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (c)
					textField.setText("");
				textField.setText(textField.getText() + a.getActionCommand());
			}
		});

		buttonPE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (c)
					textField.setText("");
				textField.setText(textField.getText() + a.getActionCommand());
			}
		});

		buttonIg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					if (x == ' ')
						textField.setText(engine.eval(textField.getText()).toString());
					else {
						double resp = Double.parseDouble(engine.eval(textField.getText()).toString());
						textField.setText(Math.pow(x, resp) + "");
						x = ' ';
					}
				} catch (ScriptException e) {
					textField.setText("ERRO!");
				}

				c = true;
			}
		});

		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 4;
		addComponent(textField, 0, 0, 7, 1);

		constraints.weightx = 1;
		constraints.weighty = 1;
		addComponent(numberButtons[1], 1, 0, 1, 1);
		addComponent(numberButtons[2], 1, 1, 1, 1);
		addComponent(numberButtons[3], 1, 2, 1, 1);

		addComponent(basicButtons[0], 1, 3, 1, 1);
		addComponent(buttonx, 1, 4, 1, 1);
		addComponent(buttonPor, 1, 5, 1, 1);
		addComponent(buttonPi, 1, 6, 1, 1);

		addComponent(numberButtons[4], 2, 0, 1, 1);
		addComponent(numberButtons[5], 2, 1, 1, 1);
		addComponent(numberButtons[6], 2, 2, 1, 1);

		addComponent(basicButtons[1], 2, 3, 1, 1);
		addComponent(buttonExpo, 2, 4, 1, 1);
		addComponent(buttonQua, 2, 5, 1, 1);
		addComponent(clear, 2, 6, 1, 1);

		addComponent(numberButtons[7], 3, 0, 1, 1);
		addComponent(numberButtons[8], 3, 1, 1, 1);
		addComponent(numberButtons[9], 3, 2, 1, 1);

		addComponent(basicButtons[2], 3, 3, 1, 1);
		addComponent(buttonRaiz, 3, 4, 1, 1);
		addComponent(buttonCub, 3, 5, 1, 1);
		addComponent(buttonPD, 3, 6, 1, 1);

		addComponent(numberButtons[0], 4, 0, 1, 1);

		addComponent(buttonPon, 4, 1, 1, 1);
		addComponent(buttonIg, 4, 2, 1, 1);
		addComponent(basicButtons[3], 4, 3, 1, 1);
		addComponent(buttonRaizc, 4, 4, 1, 1);
		addComponent(buttonxy, 4, 5, 1, 1);
		addComponent(buttonPE, 4, 6, 1, 1);

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

	public static double fat(double n) {
		double fat = 1;

		for (double i = n; i > 1; i--) {
			fat *= i;
		}

		return fat;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(400, 250);
		calc.setResizable(false);
		calc.setVisible(true);
	}
}