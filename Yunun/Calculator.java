import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
    //Buttons
    JButton calculateB = new JButton("Calculate");
    JButton exitB = new JButton("Exit");
    
    //Labels
    JLabel num1 = new JLabel("Operand 1: ");
    JLabel num2 = new JLabel("Operand 2: ");
    JLabel operator = new JLabel("Operator: ");
    JLabel result = new JLabel("Result: ");
    
    //Text
    JTextField num1Text = new JTextField(null);
    JTextField num2Text = new JTextField(null);
    JTextField operatorText = new JTextField(null);
    JTextField resultText = new JTextField(null);
    
  public Calculator(){
      setTitle("Simple Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      getContentPane().setLayout(new GridBagLayout());
      GridBagConstraints gridlimit = new GridBagConstraints();
      
      //button
      gridlimit.gridx = 0;
      gridlimit.gridy = 9;
      getContentPane().add(calculateB, gridlimit);
      
      gridlimit.gridx = 2;
      gridlimit.gridy = 9;
      getContentPane().add(exitB, gridlimit);
      
      //Label
      gridlimit.gridx = 0;
      gridlimit.gridy = 1;
      getContentPane().add(num1, gridlimit);
      gridlimit.gridx = 0;
      gridlimit.gridy = 3;
      getContentPane().add(operator, gridlimit);
      gridlimit.gridx = 0;
      gridlimit.gridy = 5;
      getContentPane().add(num2, gridlimit);
      gridlimit.gridx = 0;
      gridlimit.gridy = 7;
      getContentPane().add(result, gridlimit);
      
      //Text
      num1Text.setColumns(10);
      gridlimit.gridx = 2;
      gridlimit.gridy = 1;
      getContentPane().add(num1Text, gridlimit);
      operatorText.setColumns(10);
      gridlimit.gridx = 2;
      gridlimit.gridy = 3;
      getContentPane().add(operatorText, gridlimit);
      num2Text.setColumns(10);
      gridlimit.gridx = 2;
      gridlimit.gridy = 5;
      getContentPane().add(num2Text, gridlimit);
      resultText.setColumns(10);
      gridlimit.gridx = 2;
      gridlimit.gridy = 7;
      getContentPane().add(resultText, gridlimit);
      
      //events
      calculateB.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              Calculate(e);
          }
      });
      exitB.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              closeWindow(e);
          }
      });
    
      pack();
  }
  public static void main(String[] args){
      new Calculator().show();
  }
  public void Calculate(ActionEvent e){
      int a = Integer.parseInt(num1Text.getText());
      int b = Integer.parseInt(num2Text.getText());
      String op = operatorText.getText();
      if (op.equals("+")){
          int add = a + b;
          resultText.setText(String.valueOf(add));
      }else if(op.equals("-")){
          int sub = a - b;
          resultText.setText(String.valueOf(sub));
      }else if(op.equals("*")||op.equals("x")){
          int mul = a * b;
          resultText.setText(String.valueOf(mul));
      }else if (op.equals("/")){
          int div = a / b;
          resultText.setText(String.valueOf(div));
      }
  }
  public void closeWindow(ActionEvent e){
      JFrame f = new JFrame();
      JOptionPane.showMessageDialog(f,"Thank you for using the app");
      System.exit(0);
  }
}
