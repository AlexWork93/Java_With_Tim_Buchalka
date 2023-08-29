
public class Main {

    public static void main(String[] args) {


//    feet and inches to centimeters
        System.out.println(ToCentimeters.convert(50));
        System.out.println(ToCentimeters.convert(10,50));
//    minutes and seconds to hour
        MinAndSecToHour.convert(-1);
        MinAndSecToHour.convert(-1, -1);
        MinAndSecToHour.convert(-1, 1000);
        MinAndSecToHour.convert(1, 1000);
        MinAndSecToHour.convert(60, 30);
        MinAndSecToHour.convert(120, 0);
        MinAndSecToHour.convert(3600);



    }
}