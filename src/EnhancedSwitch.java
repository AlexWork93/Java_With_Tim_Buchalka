public class EnhancedSwitch extends SwitchConstruction implements SwitchOption, CreateOutputMessage{
    @Override
    void sayHi() {
        System.out.println("Im an enhanced switch");
    }

    @Override
    public void fromCodeToLetter(String value) {
        value = value.toLowerCase();
        String match = switch (value) {
            case "abie" -> "A";
            case "baker" -> "B";
            case "charlie" -> "C";
            case "dog" -> "D";
            case "easy" -> "E";
            default -> {
//                just for example of using "yield"
                String result = "some another letter";
                yield result;
            }
        };
        printResult(createOutputMessage(value, match));
    }

    @Override
    public void fromLetterToCode(String value) {
        value = value.toLowerCase();
        String match = switch (value) {
            case "a" -> "abie";
            case "b" -> "baker";
            case "c" -> "charlie";
            case "d" -> "dog";
            case "e" -> "easy";
            default -> {
//                just for example of using "yield"
                String result = "some another code";
                yield result;
            }
        };
        printResult(createOutputMessage(value, match));
    }

    @Override
    public void dayOfTheWeek(int dayNumber) {
        printResult("to convert from day number to name use tradition switch");
    }

    @Override
    public void dayOfTheWeek(String dayName) {
        dayName = dayName.toLowerCase();
        String match = String.valueOf(switch (dayName) {
            case "monday" -> 1;
            case "tuesday" -> 2;
            case "wednesday" -> 3;
            case "thursday" -> 4;
            case "friday" -> 5;
            case "saturday" -> 6;
            case "sunday" -> 7;
            default -> {
//                just for example of using "yield"
                String result = "some another code which I dont know";
                yield result;
            }
        });
        printResult(createOutputMessage(dayName, match));
    }

}
