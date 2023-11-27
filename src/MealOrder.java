import food.burgers.Burger;
import food.drinks.Drink;
import food.sideItems.SideItem;

public class MealOrder {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
        this("default", "default", "default", "default", "default");
    }

    public MealOrder(String burgerType, String drinkType, String drinkSize, String sideItemType, String sideItemSize) {
        this.burger = Burger.getBurger(burgerType);
        this.drink = Drink.getDrink(drinkType, drinkSize);
        this.sideItem = SideItem.getSideItem(sideItemType, sideItemSize);
    }

    private double calculateTotalPrise() {
        return burger.getPrise() + drink.getPrise() + sideItem.getPrise();
    }

    public Burger getBurger() {
        return burger;
    }

    @Override
    public String toString() {
        return "=".repeat(20) + "\n" + String.format("%s%n%s%n%s%nTotal order $%.2f%n", burger, drink, sideItem, calculateTotalPrise()) + "=".repeat(20);
    }
}