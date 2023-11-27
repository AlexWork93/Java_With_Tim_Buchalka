package food.burgerToppings;

public class EmptyTopping extends BurgerTopping{
    private final double prise = 0;
    public EmptyTopping() {
        super();
        super.setPrise(prise);
    }
}
