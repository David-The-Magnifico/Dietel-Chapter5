import java.util.Scanner;

public class FairTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your expenses for different categories:");
        System.out.print("Housing: $");
        double housing = scanner.nextDouble();
        

        
        double totalExpenses = housing /* + other categories... */;

        
        double fairTaxRate = 0.23;
        double estimatedTax = totalExpenses * fairTaxRate;

        
        System.out.printf("Your estimated tax under FairTax: $%.2f%n", estimatedTax);

        scanner.close();
    }
}