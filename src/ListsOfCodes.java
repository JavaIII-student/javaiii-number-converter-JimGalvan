import java.util.ArrayList;
import java.util.HashMap;

public class ListsOfCodes {

    static ArrayList<String> hexCombinations = new ArrayList<String>() {{
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


    static HashMap<String, String> hexToBinList = new HashMap<>(){{
        put("0", "0");
        put("1", "1");
        put("2", "10");
        put("3", "11");
        put("4", "100");
        put("5", "101");
        put("6", "110");
        put("7", "111");
        put("8", "1000");
        put("9", "1001");
        put("A", "1010");
        put("B", "1011");
        put("C", "1100");
        put("D", "1101");
        put("E", "1110");
        put("F", "1111");

    }};
}
