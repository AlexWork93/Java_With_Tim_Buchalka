public class SmartKitchen {
    private DishWasher dishWasher;
    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(DishWasher dishWasher, Refrigerator refrigerator, CoffeeMaker coffeeMaker) {
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
        this.coffeeMaker = coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    protected void addWater() {
        refrigerator.setHasWorkToDo(true);
    }

    protected void pourMilk() {
        coffeeMaker.setHasWorkToDo(true);

    }

    protected void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);

    }

    protected void setKitchenState(boolean ref, boolean coffee, boolean dish) {
        refrigerator.setHasWorkToDo(ref);
        coffeeMaker.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dish);
    }

    protected void doKitchenWork() {
        refrigerator.orderFood();
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
    }
}
