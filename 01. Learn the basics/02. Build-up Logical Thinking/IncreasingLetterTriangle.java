import java.util.Scanner;

public class IncreasingLetterTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            int currentASCII = 65;
            String row = "";
            for (int j = 0; j < i; j++) {
                if (!row.isEmpty()) {
                    row += " ";
                }
                row += (char) currentASCII;
                currentASCII++;
            }
            System.out.println(row);
        }
    }
}