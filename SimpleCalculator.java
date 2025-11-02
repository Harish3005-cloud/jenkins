// No Scanner needed
public class SimpleCalculator {
    public static void main(String[] args) {
        String name="Admin";
        double num1 = 10.0; // Hard-code a value
        double num2 = 5.0;  // Hard-code a value
        
        // --- Perform your calculations ---
        double sum = num1 + num2;
        double difference = num1 - num2;
        
        // --- Just print the results ---
        System.out.println("The numbers are: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
        System.out.println("--- Calculation Complete ---");
        System.out.println("Hello there my name is -->"+name );
    }
}