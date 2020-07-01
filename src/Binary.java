import javax.swing.*;
import java.awt.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;

public class Binary {

    static ArrayList<String> binaryCombinations = new ArrayList<String>();


    public void convertToHexadecimal() {

        try {
            String input =
                    JOptionPane.showInputDialog("Enter a binary number to convert to Hexadecimal");

           // Make an algorithm that breaks the String binary number into 4-digit combinations

            String combination = "";
            int counter = 1;

            for (int i = 0; i < input.length(); ++i) {

                // add binary numbers to a combination
                combination = combination + input.charAt(i);

                counter++;

                if (combination.length() == 4) {

                    addCombination(combination);

                    counter = 1;

                    combination = "";

                }
            }

            addZerosIfNecessary(combination);

            System.out.println(binaryCombinations);

            String result = "";

            for (int i = 0; i < binaryCombinations.size(); ++i){

                // check if current combination equals to one of the hex codes

                int size = ListsOfCodes.hexadecimalCombinations.size();

                for (int j = 0; j < size; ++j) {

                    String binCombination = binaryCombinations.get(i);

                    String hexCodes = ListsOfCodes.hexadecimalCombinations.get(j);

                    if (binCombination.equals(hexCodes)){
                        
                        System.out.println(" There is a match!");

                        result = result + j;

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "The result is: " + result,
                    "Result", JOptionPane.INFORMATION_MESSAGE);

            binaryCombinations.clear();


        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    private void addZerosIfNecessary(String combination) {

        if (combination.length() == 3) {

            combination = "0" + combination;
            addCombination(combination);
        } else if (combination.length() == 2) {
            combination = "00" + combination;
            addCombination(combination);
        } else if (combination.length() == 1) {
            combination = "000" + combination;
            addCombination(combination);
        }
    }

    private void addCombination(String combination) {
        binaryCombinations.add(combination);
    }

    public void convertToDecimal() {

        try {
            String input =
                    JOptionPane.showInputDialog("Enter a binary number to convert to Decimal");

            int integer = Integer.parseInt(input);

        } catch (HeadlessException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
