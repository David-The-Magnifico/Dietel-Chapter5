public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("n\tSum");
        long product = 1; 
        for (int n = 1; n <= 100; n++) {
            product *= n; 
            System.out.println(n + "\t" + product);
        }
        System.out.println("The difficulty with accumulating the product is that the product can grow very large, especially for larger values of n. If the product exceeds the maximum value that can be stored in the variable type used (e.g., int or long), it will result in overflow and the result will be incorrect.");
    }
}
