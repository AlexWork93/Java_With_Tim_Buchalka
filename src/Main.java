
public class Main {
    public static void main(String[] args) {
        MealOrder defaultMealOrder = new MealOrder();
        System.out.println(defaultMealOrder);
        //Example output
        //====================
        //RegularBurger $8.50
        //Total burger: $8.50
        //
        //Coke$1.00
        //
        //Fries$4.00
        //
        //Total order $13.50
        //====================

        MealOrder mealOrder = new MealOrder("cheesyBurger", "tea" , "large", "salad", "medium");
        mealOrder.getBurger().addTopping("extracheese", "mustard");
        System.out.println(mealOrder);
        //Example output
        //====================
        //CheeseBurger $10.00
        //	ExtraCheese $1.20
        //	Mustard $1.00
        //Total burger: $12.20
        //
        //LARGE Tea$2.80
        //
        //MEDIUM Salad$7.50
        //
        //Total order $22.50
        //====================
    }
}