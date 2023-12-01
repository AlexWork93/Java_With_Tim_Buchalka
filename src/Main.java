import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean shouldLoop = true;
        ArrayList<String> groceries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (shouldLoop){
            printMainMenu();
            switch (scanner.nextLine()){
                case "0" -> shouldLoop = false;
                case "1" -> addItemsToList(scanner.nextLine(), groceries);
                case "2" -> removeItemsFromList(scanner.nextLine(), groceries);
                default -> System.out.println("Wrong input");
            }
            System.out.println(groceries);
        }
    }

    public static void printMainMenu(){
        System.out.println("Available actions:");
        System.out.println("\t0 - to shutdown");
        System.out.println("\t1 - to add item(comma delimited list)");
        System.out.println("\t2 - to remove any items(comma delimited list)");
        System.out.println("Your choice:");
    }

    public static List<String> fetchDataFromInput(String string){
        return Arrays.asList((string.split(",")));
    }

    public static void addItemsToList(String userInput, ArrayList<String> groceries){
        List<String> listOfData = fetchDataFromInput(userInput);
        for (String dataItem: listOfData) {
            if (!groceries.contains(dataItem.trim())) groceries.add(dataItem.trim());
        }
    }

    public static void removeItemsFromList(String userInput, ArrayList<String> groceries){
        List<String> listOfData = fetchDataFromInput(userInput);
        for (String dataItem: listOfData) {
            groceries.remove(dataItem.trim());
        }
    }
}