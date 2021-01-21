package sorting;

public class InsertionSort {
    public void insertionSort (int[] array) {
        int j;
        //assume first element is always sorted
        for (int i = 1; i < array.length; i++) {
            j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j = j - 1;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
