import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = 0; i < n; i++) {
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
    }
}