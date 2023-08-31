public class EnhancedSwitch extends SwitchConstruction implements SwitchOption, CreateOutputMessage{
    @Override
    void sayHi() {
        System.out.println("Im an enhanced switch");
    }

    @Override
    public void switchOptionFromNatoAlphabet(String value) {
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
}
