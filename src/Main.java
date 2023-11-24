
public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen(new DishWasher(false),
                new Refrigerator(false),
                new CoffeeMaker(false));

        smartKitchen.getDishWasher().doDishes(); //I'm empty
        smartKitchen.loadDishWasher();
        smartKitchen.getDishWasher().doDishes(); //Do Dishes
        smartKitchen.getDishWasher().doDishes(); //I'm empty
        System.out.println("*".repeat(20));
        smartKitchen.doKitchenWork();//Put something in me  I'm empty   I'm empty
        System.out.println("*".repeat(20));
        smartKitchen.setKitchenState(true, true ,false);
        smartKitchen.doKitchenWork();//Order Food  Brew Coffee   I'm empty
        System.out.println("*".repeat(20));
        smartKitchen.doKitchenWork();//Put something in me  I'm empty   I'm empty

    }
}