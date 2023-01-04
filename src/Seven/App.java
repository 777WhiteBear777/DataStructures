package Seven;

import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Sort sort = new Sort();
        App app = new App();
        List<Integer> numbers = new ArrayList<>();
        int timeBefore = 0;
        int timeAfter = 0;


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Small Array -> 1");
            System.out.println("Big Array -> 2");
            System.out.println("Stop -> Stop");
            for (String numberCase = reader.readLine(); !numberCase.equalsIgnoreCase("Stop"); numberCase = reader.readLine()) {
                switch (Integer.parseInt(numberCase)) {
                    case 1 -> {
                        app.smallArray(numbers);
                        System.out.println("Print array -> 1");
                        System.out.println("Next -> 2");
                        numberCase = reader.readLine();
                        switch (Integer.parseInt(numberCase)) {
                            case 1 -> {
                                app.outPrint(numbers);
                            }
                            case 2 -> {
                            }
                        }
                    }
                    case 2 -> {
                        app.bigArray(numbers);
                        System.out.println("Print array -> 1");
                        System.out.println("Next -> 2");
                        numberCase = reader.readLine();
                        switch (Integer.parseInt(numberCase)) {
                            case 1 -> {
                                app.outPrint(numbers);
                            }
                            case 2 -> {
                            }
                        }
                    }
                }

                System.out.println("\n");
                System.out.println("Bubble sort -> 1 ;");
                System.out.println("Snaker sort -> 2 ;");
                System.out.println("Selection sort -> 3 ;");
                System.out.println("Insertion sort -> 4 ;");
                System.out.println("Quick sort -> 5 ;");

                numberCase = reader.readLine();


                switch (Integer.parseInt(numberCase)) {
                    case 1 -> {
                        timeBefore = (int) System.currentTimeMillis();
                        sort.bubbleSort(numbers);
                        timeAfter = (int) System.currentTimeMillis();
                        System.out.println("Time: " + (timeAfter - timeBefore));
                    }
                    case 2 -> {
                        timeBefore = (int) System.currentTimeMillis();
                        sort.snakerSort(numbers);
                        timeAfter = (int) System.currentTimeMillis();
                        System.out.println("Time: " + (timeAfter - timeBefore));
                    }
                    case 3 -> {
                        timeBefore = (int) System.currentTimeMillis();
                        sort.selectionSort(numbers);
                        timeAfter = (int) System.currentTimeMillis();
                        System.out.println("Time: " + (timeAfter - timeBefore));
                    }
                    case 4 -> {
                        timeBefore = (int) System.currentTimeMillis();
                        sort.insertionSort(numbers);
                        timeAfter = (int) System.currentTimeMillis();
                        System.out.println("Time: " + (timeAfter - timeBefore));
                    }
                    case 5 -> {
                        timeBefore = (int) System.currentTimeMillis();
                        sort.quickSort(numbers, 0, numbers.size() - 1);
                        timeAfter = (int) System.currentTimeMillis();
                        System.out.println("Time: " + (timeAfter - timeBefore));
                    }
                }


                System.out.println("Print array -> 1");
                System.out.println("Print All -> 2");
                System.out.println("Next -> 3");
                numberCase = reader.readLine();

                switch (Integer.parseInt(numberCase)) {
                    case 1 -> {
                        app.outPrint(numbers);
                    }
                    case 2 -> {
                        app.allPrint(numbers, timeAfter - timeBefore);
                    }
                    case 3-> {}
                }

                System.out.println("\n");
                System.out.println("Small Array -> 1");
                System.out.println("Big Array -> 2");
                System.out.println("Stop = Stop");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void outPrint(List<Integer> print) {
        for (Integer number : print) {
            System.out.print(number + " ");
        }
    }

    private void allPrint(List<Integer> print, int time) {
        for (Integer number : print) {
            System.out.print(number + " ");
        }
        System.out.println("Time: " + time);
    }

    private void smallArray(List<Integer> numbers) {
        for (int i = 0; i < 10; i++) {
            int numberList = (int) (Math.random() * 100);
            numbers.add(numberList);
        }
    }

    private void bigArray(List<Integer> numbers) {
        for (int i = 0; i < 10000; i++) {
            int numberList = (int) (Math.random() * 10000);
            numbers.add(numberList);
        }
    }
}
