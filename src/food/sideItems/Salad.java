package food.sideItems;

public class Salad extends SideItem{
    private double prise = 5;

    public Salad(String size) {
        super(size);
        super.setPrise(prise);
    }
}
