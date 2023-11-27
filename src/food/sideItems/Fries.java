package food.sideItems;

public class Fries extends SideItem{
    private double prise = 4;

    public Fries(String size) {
        super(size);
        super.setPrise(prise);
    }
}
