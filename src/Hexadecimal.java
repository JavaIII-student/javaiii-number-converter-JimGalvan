import javax.swing.*;
import java.awt.*;

public class Hexadecimal {
    public void convertToBinary() {

        try {
            String input =
                    JOptionPane.showInputDialog("Enter a Hexadecimal number to convert to Binary");

            int integer = Integer.parseInt(input);




        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void convertToDecimal() {

        try {

            String input =
                    JOptionPane.showInputDialog("Enter a Hexadecimal number to convert to Decimal");

            int integer = Integer.parseInt(input);

        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
