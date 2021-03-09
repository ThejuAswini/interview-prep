public class Problem2 {
    //This problem was recently asked by Google and Uber.
    /*
    Question: Given an array of integers, return a new array such that each element at index i of the new
              array is the product of all the numbers in the original array except the one at i.
     */

    //with division
    public static int[] productWithNonZero(int[] arr) {
        int product = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = product / arr[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = productWithNonZero(arr);
        for(int i: result) {
            System.out.println(i);
        }
    }
}
