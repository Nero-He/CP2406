import java.util.Scanner;

public class Percentages2 {
    public static void main(String args[]){
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a >> ");
        a = input.nextDouble();
        double b;
        System.out.println("Enter the number b >> ");
        b = input.nextDouble();
        computePercent(a, b);
        computePercent(b, a);
    }
    public static void computePercent(double x, double y){
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);

    }
}
