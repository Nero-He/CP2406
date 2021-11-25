public class Percentages {
    public static void main(String args[]){
        double a = 2.0;
        double b = 5.0;
        computePercent(a, b);
        computePercent(b, a);
    }
    public static void computePercent(double x, double y){
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);

    }
}
