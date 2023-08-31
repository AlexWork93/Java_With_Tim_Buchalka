// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TraditionalSwitch traditionalSwitch = new TraditionalSwitch();
        EnhancedSwitch enhancedSwitch = new EnhancedSwitch();

        traditionalSwitch.sayHi();
        traditionalSwitch.fromCodeToLetter("abie");
        traditionalSwitch.fromCodeToLetter("EASY");
        traditionalSwitch.fromCodeToLetter("BlaBla");
        traditionalSwitch.fromLetterToCode("c");
        traditionalSwitch.fromLetterToCode("D");
        traditionalSwitch.fromLetterToCode("g");
        traditionalSwitch.dayOfTheWeek(1);
        traditionalSwitch.dayOfTheWeek(2);
        traditionalSwitch.dayOfTheWeek("tuesday");
        traditionalSwitch.dayOfTheWeek("WedNesDay");
        traditionalSwitch.dayOfTheWeek("1");
        traditionalSwitch.printSeparateLine();

        enhancedSwitch.sayHi();
        enhancedSwitch.fromCodeToLetter("abie");
        enhancedSwitch.fromCodeToLetter("EASY");
        enhancedSwitch.fromCodeToLetter("BlaBla");
        enhancedSwitch.fromLetterToCode("c");
        enhancedSwitch.fromLetterToCode("D");
        enhancedSwitch.fromLetterToCode("g");
        enhancedSwitch.dayOfTheWeek(1);
        enhancedSwitch.dayOfTheWeek(2);
        enhancedSwitch.dayOfTheWeek("tuesday");
        enhancedSwitch.dayOfTheWeek("WedNesDay");
        enhancedSwitch.dayOfTheWeek("1");
        enhancedSwitch.printSeparateLine();

    }
}