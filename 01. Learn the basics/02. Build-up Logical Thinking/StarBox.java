import java.util.Scanner;

public class StarBox {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        String terminalRow = "";
        for (int i = 0; i < n; i++) {
            terminalRow += "*";
        }
        String midRow = "*";
        for (int i = 0; i < n - 2; i++) {
            midRow += " ";
        }
        midRow += "*";
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.println(terminalRow);
            } else {
                System.out.println(midRow);
            }
        }
    }
}