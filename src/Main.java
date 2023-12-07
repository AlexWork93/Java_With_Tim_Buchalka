import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(Product.getProduct(Type.POTATOES, 50, "potato"));
        products.add(Product.getProduct(Type.APPLE, 20, "apple"));
        products.add(Product.getProduct(Type.CHICKEN, 100, "chicken"));


        Store store = new Store(products);

        store.printProducts();
        //0
        //Potatoes:
        //price: 50.00
        //description: potato
        //++++++++++++++++++++
        //1
        //Apple:
        //price: 20.00
        //description: apple
        //++++++++++++++++++++
        //2
        //Chicken:
        //price: 100.00
        //description: chicken
        //++++++++++++++++++++
        store.printOrderedItems();
        //No output, the list is empty
        store.addItemToOrder(2, 1);
        store.printOrderedItems();
        //Apple x 2: 40.0
        //++++++++++++++++++++++++++++++
        store.addItemToOrder(2, 0);
        store.printOrderedItems();
        //Apple x 2: 40.0
        //++++++++++++++++++++++++++++++
        //Potatoes x 2: 100.0
        //++++++++++++++++++++++++++++++
        store.addItemToOrder(2, 2);
        store.printOrderedItems();
        //Apple x 2: 40.0
        //++++++++++++++++++++++++++++++
        //Potatoes x 2: 100.0
        //++++++++++++++++++++++++++++++
        //Chicken x 2: 200.0
        //++++++++++++++++++++++++++++++
        store.addItemToOrder(2, 3);
        store.printOrderedItems();
        //Apple x 2: 40.0
        //++++++++++++++++++++++++++++++
        //Potatoes x 2: 100.0
        //++++++++++++++++++++++++++++++
        //Chicken x 2: 200.0
        //++++++++++++++++++++++++++++++
        store.addItemToOrder(2, 1);
        store.printOrderedItems();
        //Potatoes x 2: 100.0
        //++++++++++++++++++++++++++++++
        //Chicken x 2: 200.0
        //++++++++++++++++++++++++++++++
        //Apple x 4: 80.0
        //++++++++++++++++++++++++++++++
        store.addItemToOrder(2, 2);
        store.printOrderedItems();
        //Potatoes x 2: 100.0
        //++++++++++++++++++++++++++++++
        //Apple x 4: 80.0
        //++++++++++++++++++++++++++++++
        //Chicken x 4: 400.0
        //++++++++++++++++++++++++++++++
    }
}