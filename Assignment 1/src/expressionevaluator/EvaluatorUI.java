package expressionevaluator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {

    private TextField txField = new TextField();
    private Panel buttonPanel = new Panel();

    // total of 20 buttons on the calculator,
    // numbered from left to right, top to bottom
    // bText[] array contains the text for corresponding buttons
    private static final String[] bText = {
         "1", "2", "3","+", "4", "5", "6","- ","7", "8", "9",  
        "*","^","0", "=", "/", "(", ")", "C", "CE"
    };
    private Button[] buttons = new Button[bText.length];

    public static void main(String argv[]) {
        EvaluatorUI calc = new EvaluatorUI();
    }

    public EvaluatorUI() {
        setLayout(new BorderLayout());

        add(txField, BorderLayout.NORTH);
        txField.setEditable(false);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 4));

        //create 20 buttons with corresponding text in bText[] array
        for (int i = 0; i < 20; i++) {
            buttons[i] = new Button(bText[i]);
        }

        //add buttons to button panel
        for (int i = 0; i < 20; i++) {
            buttonPanel.add(buttons[i]);
        }

        //set up buttons to listen for mouse input
        for (int i = 0; i < 20; i++) {
            buttons[i].addActionListener(this);
        }

        setTitle("Calculator");
        setSize(400, 600);
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // You need to fill in this fuction
        Evaluator evaluator = new Evaluator();
        if (arg0.getSource() == buttons[0]) {
            txField.setText(txField.getText() + "1");
        } else if (arg0.getSource() == buttons[1]) {
            txField.setText(txField.getText() + "2");
        } else if (arg0.getSource() == buttons[2]) {
            txField.setText(txField.getText() + "3");
        } else if (arg0.getSource() == buttons[3]) {
            txField.setText(txField.getText() + "+");
        } else if (arg0.getSource() == buttons[4]) {
            txField.setText(txField.getText() + "4");
        } else if (arg0.getSource() == buttons[5]) {
            txField.setText(txField.getText() + "5");
        } else if (arg0.getSource() == buttons[6]) {
            txField.setText(txField.getText() + "6");
        } else if (arg0.getSource() == buttons[7]) {
            txField.setText(txField.getText() + "-");
        } else if (arg0.getSource() == buttons[8]) {
            txField.setText(txField.getText() + "7");
        } else if (arg0.getSource() == buttons[9]) {
            txField.setText(txField.getText() + "8");
        } else if (arg0.getSource() == buttons[10]) {
            txField.setText(txField.getText() + "9");
        } else if (arg0.getSource() == buttons[11]) {
            txField.setText(txField.getText() + "*");
        } else if (arg0.getSource() == buttons[12]) {
            txField.setText(txField.getText() + "^");
        } else if (arg0.getSource() == buttons[13]) {
            txField.setText(txField.getText() + "0");
        } else if (arg0.getSource() == buttons[14]) {
            //Equals operator
            txField.setText(Integer.toString(evaluator.eval(txField.getText())));
        } else if (arg0.getSource() == buttons[15]) {
            txField.setText(txField.getText() + "/");
        } else if (arg0.getSource() == buttons[16]) {
            txField.setText(txField.getText() + "(");
        } else if (arg0.getSource() == buttons[17]) {
            txField.setText(txField.getText() + ")");
        } else if (arg0.getSource() == buttons[18]) {
            // Clear button
            txField.setText("");
        } else if (arg0.getSource() == buttons[19]) {
            //Clear entry button
            txField.setText(txField.getText());
        }
        
        
        
   
}
}
