package Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<String, String> plateNumbersMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String plateNumbers;
            String name;

            System.out.println("Command or add Plate Number:");
            for (plateNumbers = reader.readLine();
                 !plateNumbers.equalsIgnoreCase("STOP");
                 plateNumbers = reader.readLine()) {


                if (plateNumbers.equalsIgnoreCase("LIST")) {

                    for (Map.Entry<String, String> entry : plateNumbersMap.entrySet()) {
                        System.out.println(entry.getKey() + "||" + entry.getValue());
                    }

                } else if (plateNumbers.equalsIgnoreCase("NAME")) {

                    for (Map.Entry<String, String> entry : plateNumbersMap.entrySet()) {
                        System.out.println(entry.getKey());
                    }

                } else if (plateNumbers.equalsIgnoreCase("PlateNum")) {

                    for (Map.Entry<String, String> entry : plateNumbersMap.entrySet()) {
                        System.out.println(entry.getValue());
                    }

                }



                if (!plateNumbers.equalsIgnoreCase("LIST")
                        && !plateNumbers.equalsIgnoreCase("Name")
                        && !plateNumbers.equalsIgnoreCase("PlateNum")) {

                    System.out.println("Name:");
                    name = reader.readLine();
                    plateNumbersMap.put(plateNumbers, name);
                    System.out.println("Command or add Plate Number:");

                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
