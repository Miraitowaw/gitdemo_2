package javaseuse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fun(n));
    }

    public static long fun(int n) {
        if (n == 1) return 1L;
        long[] a = new long[n+1];
        a[1] = 1L;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                a[i] = a[i-1] + 1;
            } else {
                a[i] = a[i-1] * 2;
            }
        }
        return a[n];
    }
}
