import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        double km = 1.852;
        double miles = 1.150779;
        double nautical_Miles;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nautical miles needed >>");
        nautical_Miles = input.nextInt();
        double result_miles;
        double result_km;
        result_km = nautical_Miles * km;
        result_miles = nautical_Miles * miles;
        System.out.println(nautical_Miles + " nautical miles equals" + result_km + "kilometers or"+ result_miles + "miles.");

    }
}
