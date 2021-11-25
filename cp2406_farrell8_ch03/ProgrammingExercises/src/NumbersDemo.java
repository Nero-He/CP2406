public class NumbersDemo {
    public static void main(String args[]){
        int a = 5;
        int b = 9;
        displayTwiceTheNumber(a);
        displayNumberPlusFive(a);
        displayNumberSquared(a);

        displayTwiceTheNumber(b);
        displayNumberPlusFive(b);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int x){
        int number = 2;
        System.out.println(x + " times " + number + " is " + (x * number));
    }
    public static void displayNumberPlusFive(int x){
        int number = 5;
        System.out.println(x + " plus " + number + " is " + (x + number));
    }
    public static void displayNumberSquared(int x){
        System.out.println(x + " squared is " + (x * x)) ;
    }
}
