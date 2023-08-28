public class RemainderDetector {
    public static String detectRemainderWithValue(double baseValue, int valueToDetectRemainder){
        double remainder = baseValue % valueToDetectRemainder;
        String respond = baseValue + " % " + valueToDetectRemainder;
        return remainder > 0 ? respond + " is equal to " + remainder : respond + " has no reminder";
    }
}
