import javax.swing.*;
import java.awt.*;

public class ButtonField extends JPanel {
    JButton[][] button=new JButton[4][4];
    String[][]label={
            {"7","8","9","+"},
            {"4","5","6","-"},
            {"1","2","3","/"},
            {"0","C","=","*"},
    };
    public ButtonField() {
        setLayout(new GridLayout(4,4));
        for (int i=0;i<label.length;i++){
            for (int j=0;j<label[i].length;j++){
                button[i][j]=new JButton(label[i][j]);
                add(button[i][j]);
            }
        }
    }
}
