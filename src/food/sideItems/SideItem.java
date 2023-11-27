package food.sideItems;

import food.BaseFood;

public class SideItem extends BaseFood {
    public SideItem(String size) {
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

    public static SideItem getSideItem(String type, String size){
        return switch (type.toLowerCase()){
            case "salad" -> new Salad(size);
            default -> new Fries(size);
        };
    }
}
