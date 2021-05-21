import java.util.Scanner;

public class PossionDistribuiton {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        scan.close();
        
        
        double dailyCostA = 160 + 40 * (A + (A * A));
        double dailyCostB = 128 + 40 * (B + (B * B));

        
        System.out.format("%.3f%n", dailyCostA);
        System.out.format("%.3f%n", dailyCostB);
    }
}
