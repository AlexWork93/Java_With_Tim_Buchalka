import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static boolean movingForward = true;

    public static void main(String[] args) {

        LinkedList<PlaceToVisit> listOfPlacesToVisit = new LinkedList<>();
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Adelaide", 1374));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Alice Springs", 2771));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Brisbane", 917));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Darvin", 3972));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Melbourne", 877));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Perth", 3923));
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Perth", 3923)); //should return "Perth is already in list"
        addInAscendingOrder(listOfPlacesToVisit, new PlaceToVisit("Sydney", 0));

        ListIterator<PlaceToVisit> placeToVisitListIterator = listOfPlacesToVisit.listIterator();
        printMenu();

        boolean shouldLoop = true;
        Scanner sc = new Scanner(System.in);
        while (shouldLoop){
            switch (sc.nextLine()){
                case "Q", "q" -> shouldLoop = false;
                case "F", "f" -> moveToNextAndPrint(placeToVisitListIterator);
                case "P", "p" -> moveToPreviousAndPrint(placeToVisitListIterator);
                case "M", "m" -> printMenu();
                case "L", "l" -> printList(listOfPlacesToVisit);
            }
        }
    }

    public static void addInAscendingOrder(LinkedList<PlaceToVisit> list, PlaceToVisit place){
        if (list.contains(place)) System.out.printf("%s is already in list%n", place.getName());
        else {
            for (PlaceToVisit placeInList: list){
                if (place.getDistanceFromStartPoint() <= placeInList.getDistanceFromStartPoint()){
                    list.add(list.indexOf(placeInList), place);
                    return;
                }
            }
            list.add(place);
        }
    }

    public static void printMenu(){
        String menu = """
                    Available actions:
                        (F)orward
                        (B)ackward
                        (L)istPlaces
                        (M)enu
                        (Q)uit""";
        System.out.println(menu);
    }

    public static void printList(LinkedList<PlaceToVisit> list){
        System.out.println(list);
    }
    public static void moveToNextAndPrint(ListIterator<PlaceToVisit> iterator){
        if(!movingForward && iterator.hasNext()){
            movingForward = true;
            iterator.next();
        }
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }else {
            System.out.println("The End");
            movingForward = false;
        }
    }

    public static void moveToPreviousAndPrint(ListIterator<PlaceToVisit> iterator){
        if(movingForward && iterator.hasPrevious()){
            movingForward = false;
            iterator.previous();
        }
        if (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }else {
            System.out.println("The End");
            movingForward = true;
        }
    }
}