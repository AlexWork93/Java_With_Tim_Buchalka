package food.drinks;

public class Coke extends Drink{
    private double prise = 1;

    public Coke(String size) {
        super(size);
        super.setPrise(prise);
    }
}
