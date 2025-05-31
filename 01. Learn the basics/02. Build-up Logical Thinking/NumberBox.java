import java.util.Scanner;

public class NumberBox {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void printRow(int n, int i) {
        String row = "";
        int nextDigit = n;
        int offset = -1;
        for (int j = 0; j < 2 * n - 1; j++) {
            row += nextDigit;
            if (j == i) {
                offset = 0;
            }
            if (j == 2 * n - i - 2) {
                offset = 1;
            }
            nextDigit += offset;
        }
        System.out.println(row);
    }

    private static void solution(int n) {
        for (int i = 0; i < n; i++) {
            printRow(n, i);
        }
        for (int j = n - 2; j >= 0; j--) {
            printRow(n, j);
        }
    }
}