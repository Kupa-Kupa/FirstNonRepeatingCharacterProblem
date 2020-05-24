// https://www.youtube.com/watch?v=5co5Gvp_-S0

import java.util.HashMap;

public class firstNonRepeatingCharacter {

    char firstChar(String problemString) {
        HashMap<Character, Integer> char_counts = new HashMap<>();

        for (int i = 0; i < problemString.length(); i++) { // Loop control variables (i) are going up to name.length() - which is an out of bounds index (since the max index of a string/list is len - 1, throws Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range:
            char c = problemString.charAt(i);
            if (char_counts.containsKey(c)) {
                char_counts.put(c, char_counts.get(c) + 1);
            } else {
                char_counts.put(c, 1);
            }
        }

        for (int i = 0; i < problemString.length(); i++) { //can't loop through a string to name.lenghth() bc max string index is length - 1 (so always just i < name.length(); and not <=)
            char c = problemString.charAt(i);
            if (char_counts.get(c) == 1) return c;
        }

        return '_';
    }

    public static void main(String[] args) {
        // inputReader reader = new inputReader();
        // String problemString = reader.getInput();

        firstNonRepeatingCharacter test = new firstNonRepeatingCharacter();
        System.out.println(test.firstChar(args[0]));
    }
}


// You can pass the problem string to the program in different ways.
// 1. By implementing a scanner
// 2. By passing the firstChar method the main method "args". In this case args[0] - the first string passed in the command line. i.e. java firstNonRepeatingCharacter "string"
// 3. Surely vs code has some functionality to pass args... (currently when i run within vs code i get an exception bc no args have been provided - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0)