public class CompoundInterest {

    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        int years = 5; // number of years

        System.out.printf("%-10s%-20s%n", "Interest", "Amount on Deposit");

        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("%-10.2f", rate * 100);

            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%-20.2f", amount);
            }

            System.out.println();
        }
    }
}