package Ejercicios;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.w3c.dom.Text;

public class Ejemplo extends JFrame implements ActionListener {
  
  JButton Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn0, BtnDiv, BtnMult, BtnRes, BtnSuma, BtnDelete, BtnClear;
  JTextField Text;
  
  public static void main(String[] args) {
    Ejemplo ej = new Ejemplo();
    ej.GUI();
    ej.setSize(300, 300);
    ej.setVisible(true);
  }

  private void GUI() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container frame = this.getContentPane();
    this.setTitle("Ejemplo");

    frame.setLayout(new FlowLayout());

    JLabel Title = new JLabel("Calculadora");
    
    Btn1 = new JButton("1");
    Btn2 = new JButton("2");
    Btn3 = new JButton("3");
    Btn4 = new JButton("4");
    Btn5 = new JButton("5");
    Btn6 = new JButton("6");
    Btn7 = new JButton("7");
    Btn8 = new JButton("8");
    Btn9 = new JButton("9");
    Btn0 = new JButton("0");
    BtnDiv = new JButton("/");
    BtnMult = new JButton("*");
    BtnRes = new JButton("-");
    BtnSuma = new JButton("+");
    BtnDelete = new JButton("Borrar");
    BtnClear = new JButton("Limpiar");

    Text = new JTextField(15);

    Btn0.addActionListener(this);
    Btn1.addActionListener(this);
    Btn2.addActionListener(this);
    Btn3.addActionListener(this); 
    Btn4.addActionListener(this); 
    Btn5.addActionListener(this); 
    Btn6.addActionListener(this); 
    Btn7.addActionListener(this); 
    Btn8.addActionListener(this); 
    Btn9.addActionListener(this); 
    Btn0.addActionListener(this); 
    BtnDiv.addActionListener(this);  
    BtnMult.addActionListener(this);
    BtnRes.addActionListener(this);  
    BtnSuma.addActionListener(this); 
    BtnDelete.addActionListener(this);
    BtnClear.addActionListener(this); 

    frame.add(Title);
    frame.add(Text);
    frame.add(Btn1);
    frame.add(Btn2);
    frame.add(Btn3);
    frame.add(Btn4);
    frame.add(Btn5);
    frame.add(Btn6);
    frame.add(Btn7);
    frame.add(Btn8);
    frame.add(Btn9);
    frame.add(Btn0);
    frame.add(BtnDiv);
    frame.add(BtnMult);
    frame.add(BtnRes);
    frame.add(BtnSuma);
    frame.add(BtnDelete);
    frame.add(BtnClear);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource() == Btn0) {
      Text.setText(Text.getText() + "0");
    }else if(e.getSource() == Btn1) {
      Text.setText(Text.getText() + "1");
    } else if(e.getSource() == Btn2) {
      Text.setText(Text.getText() + "2");
    } else if(e.getSource() == Btn3) {
      Text.setText(Text.getText() + "3");
    } else if(e.getSource() == Btn4) {
      Text.setText(Text.getText() + "4");
    } else if(e.getSource() == Btn5) {
      Text.setText(Text.getText() + "5");
    } else if(e.getSource() == Btn6) {
      Text.setText(Text.getText() + "6");
    } else if(e.getSource() == Btn7) {
      Text.setText(Text.getText() + "7");
    } else if(e.getSource() == Btn8) {
      Text.setText(Text.getText() + "8");
    } else if(e.getSource() == Btn9) {
      Text.setText(Text.getText() + "9");
    } else if(e.getSource() == BtnDiv) {
      Text.setText(Text.getText() + "/");
    } else if(e.getSource() == BtnMult) {
      Text.setText(Text.getText() + "x");
    } else if(e.getSource() == BtnRes) {
      Text.setText(Text.getText() + "-");
    } else if(e.getSource() == BtnSuma) {
      Text.setText(Text.getText() + "+");
    } else if(e.getSource() == BtnDelete) {
      Text.setText(Text.getText().substring(0, Text.getText().length()-1));
    } else if(e.getSource() == BtnClear) {
      Text.setText("");
    } 
  } 
}
