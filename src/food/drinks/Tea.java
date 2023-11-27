package food.drinks;

public class Tea extends Drink{
    private double prise = 1.4;

    public Tea(String size) {
        super(size);
        super.setPrise(prise);
    }
}
