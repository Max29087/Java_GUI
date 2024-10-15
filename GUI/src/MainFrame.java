import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    //Step 3:
    JTextField textField = new JTextField();
    //Step 4:
    ButtonField buttonField = new ButtonField();

    public MainFrame() {
        //Step 2:
        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        //Step 5:
        add(buttonField, BorderLayout.CENTER);
        //Step 8:
        for (int i = 0; i < buttonField.button.length; i++) {
            for (int j = 0; j < buttonField.button[i].length; j++) {
                buttonField.button[i][j].addActionListener(this);
            }
        }

        //Step 1:
        setVisible(true);
        setSize(500, 600);
        setLocation(450, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Step 6: Implements ActionListener
    //Step 7:  @Override actionPerformed method;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("=")) {
            String expretion=textField.getText();
            if (expretion.contains("+")){
                String[]num=expretion.split("[+]");
                int sum=Integer.parseInt(num[0])+Integer.parseInt(num[1]);
                textField.setText(Integer.toString(sum));
            }
        } else if (e.getActionCommand().equals("C")) {
            textField.setText("");
        } else {
            textField.setText(textField.getText() + e.getActionCommand());
            //System.out.println(e.getActionCommand());
        }
    }
}
