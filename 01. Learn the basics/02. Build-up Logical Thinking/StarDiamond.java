import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void printRow(int n, int i) {
        String rowPadding = "";
        for (int j = 0; j < n - i - 1; j++) {
            rowPadding += " ";
        }
        String stars = "";
        for (int k = 0; k < (2 * i + 1); k++) {
            stars += "*";
        }
        System.out.println(rowPadding + stars);
    }

    private static void solution(int n) {
        for (int i = 0; i < n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            printRow(n, i);
        }
    }
}