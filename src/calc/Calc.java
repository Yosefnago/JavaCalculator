package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calc implements ActionListener{

	
	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton [] numberButtons = new JButton[10];
	JButton [] functions = new JButton[9];
	JButton addButton,subButton,divButton,mulButton,delButton,clrButton,decButton,equButton;
	JButton oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,zeroButton;
	Font myFont = new Font("Arial",Font.BOLD,24);
	
	double num1=0,num2=0,result=0;
	char operator;
	String str = "";

	
	Calc(){
		frame = new JFrame("Calculator");
		
		frame.setSize(420,550);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		text = new JTextField();
		text.setBounds(50,25,300,50);
		text.setFont(myFont);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		divButton = new JButton("/");
		mulButton = new JButton("*");
		delButton = new JButton("Delete");
		clrButton = new JButton("C");
		decButton = new JButton(".");
		equButton = new JButton("=");
		
		
		
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton = new JButton("4");
		fiveButton = new JButton("5");
		sixButton = new JButton("6");
		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton = new JButton("9");
		zeroButton = new JButton("0");
		
		
		addButton.setFont(myFont);
		subButton.setFont(myFont);
		divButton.setFont(myFont);
		clrButton.setFont(myFont);
		decButton.setFont(myFont);
		equButton.setFont(myFont);
		mulButton.setFont(myFont);
		
		oneButton.setFont(myFont);
		twoButton.setFont(myFont);
		threeButton.setFont(myFont);
		fourButton.setFont(myFont);
		fiveButton.setFont(myFont);
		sixButton.setFont(myFont);
		sevenButton.setFont(myFont);
		eightButton.setFont(myFont);
		nineButton.setFont(myFont);
		zeroButton.setFont(myFont);
		
		
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(5,5,10,10));
		panel.setBounds(50, 100, 300, 300);
		
		panel.add(oneButton);
		panel.add(twoButton);
		panel.add(threeButton);
		panel.add(addButton);
		
		panel.add(fourButton);
		panel.add(fiveButton);
		panel.add(sixButton);
		panel.add(subButton);
		
		panel.add(sevenButton);
		panel.add(eightButton);
		panel.add(nineButton);
		panel.add(zeroButton);
		panel.add(divButton);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(equButton);
		panel.add(clrButton);
		

		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
	
		
		equButton.addActionListener(this);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		divButton.addActionListener(this);
		decButton.addActionListener(this);
		mulButton.addActionListener(this);
		clrButton.addActionListener(this);
		
		
		
		
		
		frame.add(text);
		frame.add(panel);
		
		
	
		frame.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		Calc calc = new Calc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == oneButton) {
			str += "1";
			text.setText(text.getText() + "1");
		}
		if(e.getSource() == twoButton) {
			text.setText(text.getText() + "2");
		}
		if(e.getSource() == threeButton) {
			text.setText(text.getText() + "3");
		}
		if(e.getSource() == fourButton) {
			text.setText(text.getText() + "4");
		}
		if(e.getSource() == fiveButton) {
			text.setText(text.getText() + "5");
		}
		if(e.getSource() == sixButton) {
			text.setText(text.getText() + "6");
		}
		if(e.getSource() == sevenButton) {
			text.setText(text.getText() + "7");
		}
		if(e.getSource() == eightButton) {
			text.setText(text.getText() + "8");
		}
		if(e.getSource() == nineButton) {
			text.setText(text.getText() + "9");
		}
		if(e.getSource() == zeroButton) {
			text.setText(text.getText() + "0");
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(text.getText());
			operator = '+';
			text.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(text.getText());
			operator = '-';
			text.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(text.getText());
			operator = '/';
			text.setText("");
		}
		if(e.getSource() == decButton) {
			operator = '.';
			text.setText(text.getText() + ".");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(text.getText());
			operator = '*';
			text.setText("");
		}
		if(e.getSource() == clrButton) {
			text.setText("");
		}
		
		if (e.getSource() == equButton) {
            num2 = Double.parseDouble(text.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            text.setText(String.valueOf(result));
            num1 = result;
        }

	}
		
		
		
}


