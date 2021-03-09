import java.util.Arrays;
import java.util.HashSet;

public class Problem1 {
    //This problem was recently asked by Google.
    /*
    Question: Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
     */

    //TC: O(N) and SC:O(N)
    public boolean hasNumbers(int target, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int complement;
        for(int num: arr) {
            complement = target - num;
            if (!set.contains(complement)){
                set.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoNumberSum(int target, int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum > target) {
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
