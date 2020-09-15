import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double diff = 0.00001;
        double n = 5;
        double b = 1;

        while (n - b > diff) {
            double m = (n + x / n) / 2;
            b = n;
            n = m;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int y = x - 1;
        double a = 1;
        while (y > 0) {
            y = y - 1;
            a = x * y;
        }
        return a;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        double number = 1;
        int fact = 0;

        while (number > 0.00000000001) {
            number = 1 / factorial(fact);
            e = (number + e);
            fact = fact + 1;
        }

        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive number.");
        double num = scan.nextDouble();
        System.out.println("The square root of your input is " + babylonian(num));

        System.out.println("e is roughly " + calculateE());
        
        scan.close();
    }
}
