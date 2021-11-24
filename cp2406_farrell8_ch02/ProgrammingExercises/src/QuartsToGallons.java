public class QuartsToGallons {
    public static void main(String[] args)
    {
        int QUARTS_CHANGE_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded / QUARTS_CHANGE_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_CHANGE_GALLON;
        System.out.println("A job that needs" + quartsNeeded + "quarts requires" + gallonsNeeded + "gallons plus" +
                extraQuartsNeeded + "quarts.");

    }
}
