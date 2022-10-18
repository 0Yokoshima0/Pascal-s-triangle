import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) {
                arr[j] = combination(j,i-1);
            }
            for (int i1 = 0; i1 < i; i1++) {
                System.out.print(arr[i1] + " ");
            }
            System.out.println();
        }
    }
    private static int factorial(int n) {
        int sum = 1;
        while( n > 0 ) {
            sum = sum * n--;
        }
        return sum;
    }
    public static int combination(int m, int n) {
        return factorial(n) / (factorial(m) * factorial((n - m)));
    }
}
