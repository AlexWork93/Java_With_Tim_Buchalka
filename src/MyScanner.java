import java.util.Scanner;

public class MyScanner extends AbstractScanner implements ScanPerformer, Validator {
    MyScanner(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String scan() {
        return scanner.nextLine();
    }

}
