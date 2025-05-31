import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int a = 1; a <= i; a++) {
                if (!row.isEmpty()) {
                    row += " ";
                }
                row += a;
            }
            for (int b = 0; b < (n - i) * 4; b++) {
                row += " ";
            }
            for (int c = i; c > 0; c--) {
                if (!row.isEmpty()) {
                    row += " ";
                }
                row += c;
            }
            System.out.println(row);
        }
    }
}