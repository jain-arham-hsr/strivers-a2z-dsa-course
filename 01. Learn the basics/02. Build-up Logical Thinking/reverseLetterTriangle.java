import java.util.Scanner;

public class reverseLetterTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        for (int i = n; i > 0; i--) {
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