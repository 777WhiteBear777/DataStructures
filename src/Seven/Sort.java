package Seven;

import java.util.List;

public class Sort {
    private int swap;

    public void bubbleSort(List<Integer> sort) {
        for (int i = 0; i < sort.size() - 1; i++) {
            for (int j = 0; j  < sort.size() - i - 1; j++) {
                if (sort.get(j + 1) < sort.get(j)) {
                    swap = sort.get(j);
                    sort.set(j, sort.get(j + 1));
                    sort.set(j + 1, swap);
                }
            }
        }
    }

    public void snakerSort(List<Integer> sort) {

        int right = sort.size() - 1;
        int left = 0;

        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (sort.get(i - 1) > sort.get(i)) {
                    swap = sort.get(i);
                    sort.set(i, sort.get(i - 1));
                    sort.set(i - 1, swap);
                }
            }

            left++;

            for (int i = left; i < right; i++) {
                if (sort.get(i + 1) < sort.get(i)) {
                    swap = sort.get(i);
                    sort.set(i, sort.get(i + 1));
                    sort.set(i + 1, swap);
                }
            }

            right--;

        }
    }


    public void selectionSort(List<Integer> sort) {


        for (int i = 0; i < sort.size(); i++) {

            int pos = i;
            int minNumber = sort.get(i);

            for (int j = i + 1; j < sort.size(); j++) {
                if (sort.get(j) < minNumber) {
                    pos = j;
                    minNumber = sort.get(j);
                }
            }
            sort.set(pos, sort.get(i));
            sort.set(i, minNumber);
        }
    }

    public void insertionSort(List<Integer> sort) {

        for (int i = 1; i < sort.size(); i++) {
            swap = sort.get(i);
            int j = i;
            while (j > 0 && sort.get(j - 1) > swap) {
                sort.set(j, sort.get(j - 1));
                j--;
            }

            sort.set(j, swap);
        }

    }


    public void quickSort(List<Integer> sort, int low, int high) {
        if (low >= high) return;

        int number = sort.get(low + (high - low) / 2);
        int i = low;
        int j = high;

        while (i <= j) {
            while (sort.get(i) < number) {
                i++;
            }
            while (sort.get(j) > number) {
                j--;
            }

            if (i <= j) {
                swap = sort.get(i);
                sort.set(i, sort.get(j));
                sort.set(j, swap);
                i++;
                j--;
            }
        }
        if (low < j) quickSort(sort, low, j);
        if (high > i) quickSort(sort, i, high);
    }

}
