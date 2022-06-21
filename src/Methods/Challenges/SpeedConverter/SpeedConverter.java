package Methods.Challenges.SpeedConverter;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        // 1 mile per hour is equal to 1.609 kilometer per hour

        if (kilometersPerHour < 0){
//            return Math.round(kilometersPerHour);
            return -1;
        }

        return (long) kilometersPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = (kilometersPerHour / 1.609);

            System.out.println(kilometersPerHour + " km/h = " + Math.round(milesPerHour) + " mi/h");
        }
    }

    public static void main(String[] args) {
        double result = toMilesPerHour(5.0);
        printConversion(result);
    }


    //Alternative
//    public static long toMilesPerHour(double kilometersPerHour)  {
//        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour)  {
//        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//    }
}
