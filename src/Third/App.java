package Third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Set<String> plateNumbersList = new HashSet<>();
        Iterator<String> iterator;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;


            for (line = reader.readLine(); !line.equalsIgnoreCase("STOP"); line = reader.readLine()) {


                if (line.equalsIgnoreCase("LIST")) {
                    iterator = plateNumbersList.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
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
