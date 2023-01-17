package javaseuse;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
//        int[][] b = new int[n+1][m+1];
        int[] row = new int[n+1];
        int[] col = new int[m+1];
        int n1 = n>m?n:m;
        int[] b = new int[n1];
        for (int i = 0; i < k; i++) {
            int t1 = scanner.nextInt();
            int t2 = scanner.nextInt();
            if (t1 == t2) b[t1] = 1;
            row[t1]++;
            col[t2]++;
        }
        int rowM = 0, colM = 0;
        int ri = 0, ci = 0;
        for (int i = 1; i <= n; i++) {
            if (rowM < row[i]) {
                rowM = row[i];
                ri = i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (colM < col[i]){
                colM = col[i];
                ci = i;
            }
        }
        if (ri == ci && b[ri] == 1) {
            System.out.println(rowM+colM-1);
        } else {
            System.out.println(rowM+colM);
        }
    }
}
