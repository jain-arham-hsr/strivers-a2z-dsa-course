import java.util.Scanner;

public class NForest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        solution(n);
    }

    private static void solution(int n) {
        String row = "";
        for (int i = 0; i < n; i++) {
            if (!row.isEmpty()) {
                row += " ";
            }
            row += "*";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(row);
        }
    }
}