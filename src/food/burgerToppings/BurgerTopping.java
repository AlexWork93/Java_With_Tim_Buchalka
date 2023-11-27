package food.burgerToppings;

public class BurgerTopping {
    private double prise;


    public static BurgerTopping getTopping(String type) {
        return switch (type.toLowerCase()){
            case "mustard" -> new Mustard();
            case "chilli" -> new Chilli();
            case "extracheese" -> new ExtraCheese();
            default ->  new EmptyTopping();
        };
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f%n", this.getClass().getSimpleName(), prise);
    }
}

