import javax.swing.*;
import java.util.ArrayList;

public class Binary {

    ArrayList<String> binaryCombinations = new ArrayList<String>();
    String binaryNumber;

    public void convertToHexadecimal() {

        String input =
                JOptionPane.showInputDialog("Enter a binary number to convert to Hexadecimal");

        addZerosIfNecessary(input);

        if (binaryNumber.length() > 32) {

            System.out.println("The binary number should be 32-digit long");

        } else {

            // Make an algorithm that breaks the String binary number into 4-digit combinations

            String combination = "";
            int counter = 1;

            System.out.println(binaryNumber);

            for (int i = binaryNumber.length() - 1; i >= 0; i--) {

                // add binary numbers to a combination
                combination = binaryNumber.charAt(i) + combination;

                counter++;

                if (combination.length() == 4) {

                    addCombination(combination);

                    counter = 1;

                    combination = "";

                }
            }

            System.out.println(binaryCombinations);

            String result = "";

            for (int i = 0; i < binaryCombinations.size(); ++i) {

                // check if current combination equals to one of the hex codes

                int size = ListsOfCodes.hexCombinations.size();

                for (int j = 0; j < size; ++j) {

                    String binCombination = binaryCombinations.get(i);

                    String hexCodes = ListsOfCodes.hexCombinations.get(j);

                    if (binCombination.equals(hexCodes)) {

                        System.out.println(" There is a match!");

                        result = j + result;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "The result is: " + result,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
            
            binaryCombinations.clear();

        }
    }


    private void addZerosIfNecessary(String input) {

        while (input.length() % 4 != 0) {

            input = "0" + input;

        }

        binaryNumber = input;
    }

    private void addCombination(String combination) {
        binaryCombinations.add(combination);
    }

    public void convertToDecimal() {

        String input =
                JOptionPane.showInputDialog("Enter a binary number to convert to Decimal");

        int binaryNumber = Integer.parseInt(input);

        // For each binary digit add a


    }
}