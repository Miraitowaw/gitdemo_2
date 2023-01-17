package javaseuse;

public class Solution1 {
    public static void main(String[] args) {
        int n = 100;
        int[] lights = new int[n+1];
        int k;
        for (int i = 1; i <= n; i++) {
            lights[i] = 0;
        }
        for (int i = 2; i <= n; i++) {
            k = 1;
            while (i * k <= n) {
                lights[i*k] = 1 - lights[i*k];
                k += 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (lights[i] == 1)
                System.out.print(i + " ");
        }
    }
}
