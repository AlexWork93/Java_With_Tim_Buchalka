package food.drinks;

public class Fanta extends Drink{
    private double prise = 1.2;

    public Fanta(String size) {
        super(size);
        super.setPrise(prise);
    }
}
