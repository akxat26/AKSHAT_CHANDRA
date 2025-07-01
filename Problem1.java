import java.util.Scanner;

public class Problem1 {
    public static double calculate(double a, double b, String op) {
        if (op.equalsIgnoreCase("add")) {
            return a + b;
        }
        if (op.equalsIgnoreCase("subtract")) {
            return a - b;
        }
        if (op.equalsIgnoreCase("multiply")) {
            return a * b;
        }
        if (op.equalsIgnoreCase("divide")) {
            return b == 0 ? Double.NaN : a / b;
        }
        return Double.NaN; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next(); 
        System.out.println("Result: " + calculate(a, b, op));
        sc.close();
    }
}
