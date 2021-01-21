package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort testObj = new BubbleSort();

    @Test
    void bubbleSort() {
        int[] array = {2, 4, 1, 5, 3, 7};
        testObj.bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}