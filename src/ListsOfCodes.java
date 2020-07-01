import java.util.ArrayList;
import java.util.HashMap;

public class ListsOfCodes {

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


    static HashMap<String, Integer> hexToBinList = new HashMap<>(){{
        put("0", 0000);
        put("1", 0001);
        put("2", 0010);
        put("3", 0011);
        put("4", 0100);
        put("5", 0101);
        put("6", 0110);
        put("7", 0111);
        put("8", 1000);
        put("9", 1001);
        put("A", 1010);
        put("B", 1011);
        put("C", 1100);
        put("D", 1101);
        put("E", 1110);
        put("F", 1111);

    }};
}
