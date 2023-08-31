public class TraditionalSwitch extends SwitchConstruction implements SwitchOption, CreateOutputMessage{


    @Override
    void sayHi() {
        System.out.println("Im a traditional switch");
    }

    @Override
    public void switchOptionFromNatoAlphabet(String value) {
        value = value.toLowerCase();
        String match;
        switch (value){
            case "abie":
                match = "A";
                break;
            case "baker":
                match = "B";
                break;
            case "charlie":
                match = "C";
                break;
            case "dog":
                match = "D";
                break;
            case "easy":
                match = "E";
                break;
            default:
                match = "some another letter";
        }
        printResult(createOutputMessage(value, match));
    }
}
