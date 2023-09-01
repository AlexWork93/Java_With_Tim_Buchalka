import java.util.HashMap;
import java.util.Map;

public interface Validator {

    default Map<Boolean, Integer> getIntFromString(String value) {
        Map<Boolean, Integer> result = new HashMap<>();
        try {
            result.put(true, Integer.parseInt(value));
        } catch (NumberFormatException exception) {
            result.put(false, -1);
            System.out.println("Bad input");
        }
        return result;
    }

    default boolean validateEmptyString(String value) {
        if (value.isEmpty()) {
            System.out.println("Bad input");
            return true;
        }
        else {
            return false;
        }
    }

    default boolean validateCorrectAge(int birthYear) {
        if (2023 - birthYear <= 100 && 2023 - birthYear > 0)
            return true;
        else {
            System.out.println("Bad input");
            return false;
        }
    }
}
