import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator implements ActionListener {

    JFrame frame = new JFrame("Calculator");
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    TextField textField;
    GridLayout grid;
    Panel panel = new Panel();
    String input;
    String inputOne;
    String inputTwo;
    int operator;
    String temp = "";

    MyCalculator(){
        frame.setLayout(new FlowLayout());

        b1 = new JButton("0");
        //b1.setForeground(Color.BLUE);
        b1.addActionListener(this);

        b2 = new JButton("1");
        b2.addActionListener(this);

        b3 = new JButton("2");
        b3.addActionListener(this);

        b4 = new JButton("3");
        b4.addActionListener(this);
        b5 = new JButton("4");
        b5.addActionListener(this);
        b6 = new JButton("5");
        b6.addActionListener(this);
        b7 = new JButton("6");
        b7.addActionListener(this);
        b8 = new JButton("7");
        b8.addActionListener(this);
        b9 = new JButton("8");
        b9.addActionListener(this);
        b10 = new JButton("9");
        b10.addActionListener(this);
        b11 = new JButton("C");
        b11.addActionListener(this);
        b12 = new JButton("+");
        b12.addActionListener(this);
        b13 = new JButton("-");
        b13.addActionListener(this);
        b14 = new JButton("*");
        b14.addActionListener(this);
        b15 = new JButton("/");
        b15.addActionListener(this);
        b16 = new JButton("=");
        b16.addActionListener(this);

        textField = new TextField(20);
        frame.add(textField);
        grid = new GridLayout(4, 4, 10, 20);
        panel.setLayout(grid);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        frame.add(panel);
        frame.getContentPane().setBackground(new Color(194, 197, 204));
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1.equals(e.getSource())) {
            input = "0";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b2.equals(e.getSource())) {
            input = "1";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b3.equals(e.getSource())) {
            input = "2";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b4.equals(e.getSource())) {
            input = "3";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b5.equals(e.getSource())) {
            input = "4";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b6.equals(e.getSource())) {
            input = "5";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b7.equals(e.getSource())) {
            input = "6";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b8.equals(e.getSource())) {
            input = "7";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b9.equals(e.getSource())) {
            input = "8";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b10.equals(e.getSource())) {
            input = "9";
            temp = temp + input;
            textField.setText(temp);
        }
        if (b11.equals(e.getSource())) {
            input = "";
            temp = "";
            inputOne = "";
            inputTwo = "";
            textField.setText(temp);
        }
        if (b12.equals(e.getSource())) {
            temp = "";
            inputOne = textField.getText();
            textField.setText("+");
            operator = 1;
        }
        if (b13.equals(e.getSource())) {
            temp = "";
            inputOne = textField.getText();
            textField.setText("-");
            operator = 2;
        }
        if (b14.equals(e.getSource())) {
            temp = "";
            inputOne = textField.getText();
            textField.setText("*");
            operator = 3;
        }
        if (b15.equals(e.getSource())) {
            temp = "";
            inputOne = textField.getText();
            textField.setText("/");
            operator = 4;
        }
        if (b16.equals(e.getSource())) {
            temp = "";
            inputTwo = textField.getText();

            switch (operator){

                case 1:
                        double sum = Double.parseDouble(inputOne)+Double.parseDouble(inputTwo);
                        textField.setText(String.valueOf(sum));
                        break;

                case 2:
                    double sub = Double.parseDouble(inputOne)-Double.parseDouble(inputTwo);
                    textField.setText(String.valueOf(sub));
                    break;

                case 3:
                    double mul = Double.parseDouble(inputOne) * Double.parseDouble(inputTwo);
                    textField.setText(String.valueOf(mul));
                    break;

                case 4:
                    double div = Double.parseDouble(inputOne) / Double.parseDouble(inputTwo);
                    textField.setText(String.valueOf(div));
                    break;

            }
        }
    }

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
    }
}


