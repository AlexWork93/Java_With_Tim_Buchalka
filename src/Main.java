// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TraditionalSwitch traditionalSwitch = new TraditionalSwitch();
        EnhancedSwitch enhancedSwitch = new EnhancedSwitch();

        traditionalSwitch.sayHi();
        traditionalSwitch.switchOptionFromNatoAlphabet("abie");
        traditionalSwitch.switchOptionFromNatoAlphabet("EASY");
        traditionalSwitch.switchOptionFromNatoAlphabet("BlaBla");

        enhancedSwitch.sayHi();
        enhancedSwitch.switchOptionFromNatoAlphabet("abie");
        enhancedSwitch.switchOptionFromNatoAlphabet("EASY");
        enhancedSwitch.switchOptionFromNatoAlphabet("BlaBla");
    }
}