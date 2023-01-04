package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> plateNumbersList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            for (line = reader.readLine(); !line.equalsIgnoreCase("STOP"); line = reader.readLine()) {
                if (line.equalsIgnoreCase("LIST")) {
                    for (String allData : plateNumbersList) {
                        System.out.println(allData);
                    }
                }
                if (!line.equalsIgnoreCase("LIST")) {
                    plateNumbersList.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
