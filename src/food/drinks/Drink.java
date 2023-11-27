package food.drinks;

import food.BaseFood;

public class Drink extends BaseFood {
    public Drink(String size) {
        super(size);
    }

    @Override
    public void setPrise(double prise) {
        super.setPrise(prise * switch (this.getSize().toLowerCase()){
            case "small" -> 1;
            case "medium" -> 1.5;
            case "large" -> 2;
            default -> 1;
        });
    }

    public static Drink getDrink(String type, String size){
        return switch (type.toLowerCase()){
            case "fanta" -> new Fanta(size);
            case "tea" -> new Tea(size);
            default -> new Coke(size);
        };
    }
}
