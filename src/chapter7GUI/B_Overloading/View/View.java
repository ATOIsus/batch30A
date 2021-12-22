package chapter7GUI.B_Overloading.View;

import chapter7GUI.B_Overloading.MathLogic.MathLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {


    JButton buttonCalculate;
    JButton buttonExit;
    JTextField textFirst;
    JTextField textSecond;
    JLabel labelFirst;
    JLabel labelSecond;
    JRadioButton radioAdd;
    JRadioButton radioSubtract;
    JRadioButton radioMultiply;
    JRadioButton radioDivide;
    ButtonGroup groupButton;

    int result = 0;


    View() {


        setLayout(null);
        setSize(300, 300);
        setResizable(false);
        setTitle("Math Operation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        labelFirst = new JLabel("First Number ");
        labelFirst.setBounds(20, 20, 100, 20);
        add(labelFirst);

        textFirst = new JTextField();
        textFirst.setBounds(150, 20, 100, 20);
        add(textFirst);


        labelSecond = new JLabel("Second Number");
        labelSecond.setBounds(20, 50, 100, 20);
        add(labelSecond);

        textSecond = new JTextField();
        textSecond.setBounds(150, 50, 100, 20);
        add(textSecond);


        radioAdd = new JRadioButton("Add");
        radioAdd.setBounds(20, 90, 90, 20);
        add(radioAdd);
        radioAdd.addActionListener(this);

        radioSubtract = new JRadioButton("Subtract");
        radioSubtract.setBounds(120, 90, 90, 20);
        add(radioSubtract);
        radioSubtract.addActionListener(this);

        radioMultiply = new JRadioButton("Multiply");
        radioMultiply.setBounds(20, 120, 90, 20);
        add(radioMultiply);
        radioMultiply.addActionListener(this);

        radioDivide = new JRadioButton("Divide");
        radioDivide.setBounds(120, 120, 90, 20);
        add(radioDivide);
        radioDivide.addActionListener(this);


        groupButton = new ButtonGroup();
        groupButton.add(radioAdd);
        groupButton.add(radioSubtract);
        groupButton.add(radioMultiply);
        groupButton.add(radioDivide);


        buttonCalculate = new JButton("Calculate");
        buttonCalculate.setBounds(50, 180, 100, 20);
        add(buttonCalculate);
        buttonCalculate.addActionListener(this);

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(190, 180, 80, 20);
        add(buttonExit);
        buttonExit.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(textFirst.getText());
        int b = Integer.parseInt(textSecond.getText());

        MathLogic obb = new MathLogic();

        obb.setFirstNum(a);
        obb.setSecondNum(b);

        if (e.getSource().equals(radioAdd)) {
            result = obb.add();
        }

        if (e.getSource().equals(radioSubtract)) {
            result = obb.subtract();
        }

        if (e.getSource().equals(radioMultiply)) {
            result = obb.multiply();
        }

        if (e.getSource().equals(radioDivide)) {
            result = obb.divide();
        }


        if (e.getSource().equals(buttonCalculate)) {
            JOptionPane.showMessageDialog(null,
                    "First Number       :  " + obb.firstNumber() +
                            "\nSecond Number:   " + obb.secondNumber() +
                            "\nResult                   :  " + result);
        }

        if (e.getSource().equals(buttonExit)) {
            System.exit(0);
        }

    }


    public static void main(String[] args) {
        new View().setVisible(true);
    }
}

