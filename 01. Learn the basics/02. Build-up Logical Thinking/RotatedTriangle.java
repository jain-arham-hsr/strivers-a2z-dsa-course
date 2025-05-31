import java.util.Scanner;

public class RotatedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void printRow(int n, int i) {
        String stars = "";
        for (int k = 0; k < i; k++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    private static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            printRow(n, i);
        }
    }
}