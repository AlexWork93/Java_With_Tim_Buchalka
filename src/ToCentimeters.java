public class ToCentimeters {
    public static double convert(double inches){
        return inches * 2.54;
    }

    public static double convert(double feet, double inches){
        return convert(feet * 12 + inches);
    }

}
