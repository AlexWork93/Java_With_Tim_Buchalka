package food.burgers;

import food.BaseFood;
import food.burgerToppings.*;

public class Burger extends BaseFood {

    BurgerTopping topping1 = BurgerTopping.getTopping("");
    BurgerTopping topping2 = BurgerTopping.getTopping("");
    BurgerTopping topping3 = BurgerTopping.getTopping("");

    public Burger() {
    }

    public static Burger getBurger(String type) {
        return switch (type.toLowerCase()) {
            case "cheesyburger" -> new CheeseBurger();
            default -> new RegularBurger();
        };
    }

    @Override
    public void setPrise(double prise) {
        super.setPrise(prise);
    }

    public void addTopping(String top1) {
        addTopping(top1, "default");
    }

    public void addTopping(String top1, String top2) {
        addTopping(top1, top2, "default");
    }

    public void addTopping(String top1, String top2, String top3) {
        topping1 = BurgerTopping.getTopping(top1);
        topping2 = BurgerTopping.getTopping(top2);
        topping3 = BurgerTopping.getTopping(top3);
    }

    @Override
    public double getPrise() {
        return super.getPrise() + topping1.getPrise() + topping2.getPrise() + topping3.getPrise();
    }

    @Override
    public String toString() {
        String text = String.format("%s $%.2f%n", this.getClass().getSimpleName(), super.getPrise());
        if (!topping1.toString().toLowerCase().contains("empty")){
            text += "\t" + topping1.toString();
        }
        if (!topping2.toString().toLowerCase().contains("empty")){
            text += "\t" + topping2.toString();
        }
        if (!topping3.toString().toLowerCase().contains("empty")){
            text += "\t" + topping3.toString();
        }
        text += String.format("Total burger: $%.2f%n", getPrise());
        return text;
    }
}
