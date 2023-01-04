package Second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> plateNumbersList = new ArrayList<>();
        Iterator<String> iterator;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            String numberLine;


            for (line = reader.readLine(); !line.equalsIgnoreCase("STOP"); line = reader.readLine()) {


                if (line.equalsIgnoreCase("LIST")) {
                    iterator = plateNumbersList.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                if (!line.equalsIgnoreCase("LIST")) {
                    numberLine = reader.readLine();
                    if (plateNumbersList.size() <= Integer.parseInt(numberLine)) {
                        plateNumbersList.add(plateNumbersList.size(), line);
                    } else {
                        plateNumbersList.add(Integer.parseInt(numberLine), line);
                    }

                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
