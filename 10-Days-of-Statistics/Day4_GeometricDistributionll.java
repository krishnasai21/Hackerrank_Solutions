import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);
        int numerator   = scan.nextInt();
        int denominator = scan.nextInt();
        int n           = scan.nextInt();
        scan.close();
       
        double p = (double) numerator / denominator;
        double result = 0;
        for (int i = 1; i <= 5; i++) {
            result += geometric(i, p);
        }
        System.out.format("%.3f", result);
    }
    
    private static double geometric (int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
    
    private static Long combinations(int n, int x) {
        if (n < 0 || x < 0 || x > n) {
            return null;
        }
        return factorial(n) / (factorial(x) * factorial(n - x));
    }
    
    private static Long factorial (int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
