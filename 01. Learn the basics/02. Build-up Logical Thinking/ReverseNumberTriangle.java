import java.util.Scanner;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = n; i > 0; i--) {
            String row = "";
            for (int j = 1; j <= i; j++) {
                if (!row.isEmpty()) {
                    row += " ";
                }
                row += j;
            }
            System.out.println(row);
        }
    }
}