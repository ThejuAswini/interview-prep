package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    InsertionSort testObj = new InsertionSort();

    @Test
    void insertionSort() {
        int[] array = {8, 5, 3, 9, 5, 6, 2};
        testObj.insertionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}