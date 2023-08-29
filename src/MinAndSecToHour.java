public class MinAndSecToHour {
    public static void convert(int seconds){
        if (validate(seconds)){
            printResult(seconds / (60 * 60));
        }else {
            printResult(-1);
        }
    }

    public static void convert(int minutes, int seconds){
        if (validate(minutes, seconds)){
            printResult((minutes * 60 + seconds) / (60 * 60));
        }else {
            printResult(-1);
        }
    }
    private static void printResult(int value){
        if (value < 0){
            System.out.println("invalid input");
        } else {
            System.out.println(value + " hours");
        }
    }
    private static boolean validate(int seconds){
        return seconds >= 0;
    }

    private static boolean validate(int minutes, int seconds){
        return minutes > 0 && seconds >= 0 && seconds < 60;
    }
}
