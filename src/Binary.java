import javax.swing.*;
import java.util.ArrayList;

public class Binary {

<<<<<<< Updated upstream
    static ArrayList<String> binaryCombinations = new ArrayList<String>();

    static ArrayList<String> hexadecimalCombinations = new ArrayList<String>() {{
        add("0000");
        add("0001");
        add("0010");
        add("0011");
        add("0100");
        add("0101");
        add("0110");
        add("0111");
        add("1000");
        add("1001");

    }};

=======
    ArrayList<String> binaryCombinations = new ArrayList<String>();
    String binaryNumber;
>>>>>>> Stashed changes

    public void convertToHexadecimal() {

        String input =
                JOptionPane.showInputDialog("Enter a binary number to convert to Hexadecimal");

        addZerosIfNecessary(input);

        if (binaryNumber.length() > 32) {

            System.out.println("The binary number should be 32-digit long");

<<<<<<< Updated upstream
            // 1. Get string containing the binary number not max of 32 digits
            // which is 8 combinations, (i.e. (1111)(1100)()()()()()()..)

            // 2. Make an algorithm that breaks the String binary number into 4-digit combinations
=======
        } else {

            // Make an algorithm that breaks the String binary number into 4-digit combinations
>>>>>>> Stashed changes

            String combination = "";
            int counter = 1;

            System.out.println(binaryNumber);

            for (int i = 0; i < binaryNumber.length(); ++i) {

                // add binary numbers to a combination
                combination = combination + binaryNumber.charAt(i) ;

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

                for (int j = 0; j < hexadecimalCombinations.size(); ++j) {

                    String binCombination = binaryCombinations.get(i);

<<<<<<< Updated upstream
                    if (binCombination.equals(hexadecimalCombinations.get(j))){
=======
                    String hexCodes = ListsOfCodes.hexadecimalCombinations.get(j);

                    if (binCombination.equals(hexCodes)) {

>>>>>>> Stashed changes
                        System.out.println(" There is a match!");

                        result = result + j;

                    }
                }
            }

            System.out.println(result + ", " + "End!");


            binaryCombinations.clear();


        }
    }


    private void addZerosIfNecessary(String input) {

        while (input.length() % 4 != 0){

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

        int integer = Integer.parseInt(input);

    }
}
