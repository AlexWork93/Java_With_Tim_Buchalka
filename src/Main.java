import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner(new Scanner(System.in));
        String name = "";
        do {
            System.out.println("Enter Your Name");
            name = myScanner.scan();
        }while (myScanner.validateEmptyString(name));
        Map<Boolean, Integer> myMap = new HashMap<>();
        boolean condition = true;
        while (condition){
            System.out.println("Enter Your Birth Year");
            myMap = myScanner.getIntFromString(myScanner.scan());
            if (!myMap.isEmpty() && myMap.containsKey(true))
                if (myScanner.validateCorrectAge(myMap.get(true))) {
                    condition = false;
                }
        }
        System.out.println(name + " " + myMap.get(true));
    }
}