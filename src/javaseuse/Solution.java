package javaseuse;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(maxk(array, k));
    }

    public static int maxk(int[] array, int k) {
        Arrays.sort(array);
        int t = 1;
        for (int i = array.length-1; i >= 0; i--) {
            if (t == k) return array[i];
            if (i > 0 && array[i] > array[i-1]) t++;
        }
        return -1;
    }
}
