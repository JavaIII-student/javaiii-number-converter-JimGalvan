import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Hexadecimal {
    public void convertToBinary() {

            String input =
                    JOptionPane.showInputDialog("Enter a Hexadecimal number to convert to Binary");

            HashMap<String, String> hexToBinList = ListsOfCodes.hexToBinList;

            String binary = "";

            for (int i = 0; i < input.length(); i++){

                for ( String key : hexToBinList.keySet() ) {

                    if (String.valueOf(input.charAt(i)).equals(key)){

                        binary = binary + hexToBinList.get(key).toString();

                    }
                }
            }

        JOptionPane.showMessageDialog(null, "The result is: " + binary,
                "Result", JOptionPane.INFORMATION_MESSAGE);
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
