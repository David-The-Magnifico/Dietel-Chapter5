import java.util.Scanner;

public class EstimateE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for estimation: ");
        int n = input.nextInt();
        double e = 1.0;
        double factorial = 1.0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }
        System.out.println("Estimation of e: " + e);
    }
}
