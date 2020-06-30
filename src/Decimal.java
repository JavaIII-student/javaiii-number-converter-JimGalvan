import javax.swing.*;
import java.awt.*;

public class Decimal {
    public void convertToHexadecimal() {

        try {
            String input =
                    JOptionPane.showInputDialog("Enter a Decimal number to convert to Hexadecimal");

            int integer = Integer.parseInt(input);

        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public void convertToBinary() {

        try {
            String input =
                    JOptionPane.showInputDialog("Enter a Decimal number to convert to Binary");

            int integer = Integer.parseInt(input);

        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
