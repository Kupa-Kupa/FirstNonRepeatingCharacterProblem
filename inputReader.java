import java.util.*;

public class inputReader {

    public String getInput() {
        String inputLine = null;
        System.out.print("> ");
        try {
            Scanner reader = new Scanner(System.in);
            inputLine = reader.nextLine();
            reader.close();
            if (inputLine.length() == 0) return null;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return inputLine.toLowerCase();
    }
}

// inputReader reader = new inputReader();
// String x = reader.getInput();
// System.out.println(x);