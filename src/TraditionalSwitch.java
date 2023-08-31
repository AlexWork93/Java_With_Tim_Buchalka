public class TraditionalSwitch extends SwitchConstruction implements SwitchOption, CreateOutputMessage{


    @Override
    void sayHi() {
        System.out.println("Im a traditional switch");
    }

    @Override
    public void fromCodeToLetter(String value) {
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

    @Override
    public void fromLetterToCode(String value) {
        value = value.toLowerCase();
        String match;
        switch (value){
            case "a":
                match = "abie";
                break;
            case "b":
                match = "baker";
                break;
            case "c":
                match = "charlie";
                break;
            case "d":
                match = "dog";
                break;
            case "e":
                match = "easy";
                break;
            default:
                match = "some another code";
        }
        printResult(createOutputMessage(value, match));
    }

    @Override
    public void dayOfTheWeek(int dayNumber) {
        String match;
        switch (dayNumber){
            case 1:
                match = "monday";
                break;
            case 2:
                match = "tuesday";
                break;
            case 3:
                match = "wednesday";
                break;
            case 4:
                match = "thursday";
                break;
            case 5:
                match = "friday";
                break;
            case 6:
                match = "saturday";
                break;
            case 7:
                match = "sunday";
                break;
            default:
                match = "some another day";
        }
        printResult(createOutputMessage(String.valueOf(dayNumber), match));
    }

    @Override
    public void dayOfTheWeek(String dayName) {
        printResult("to convert from name to day number use enhanced switch");
    }
}
