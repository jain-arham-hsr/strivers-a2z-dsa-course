import java.util.Scanner;

public class IncreasingNumTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 0; j < i; j++) {
                if (!row.isEmpty()) {
                    row += " ";
                }
                row += num++;
            }
            System.out.println(row);
        }
    }
}