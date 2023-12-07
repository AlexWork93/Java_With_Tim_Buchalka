import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<OrderItem> orderItems;

    public Store(ArrayList<Product> products) {
        this.products = products;
        this.orderItems = new ArrayList<>();
    }

    public void printOrderedItems(){
        System.out.println();
        for (OrderItem orderItem: orderItems){
            orderItem.product().printPrice(orderItem.quantity());
            System.out.println("+".repeat(30));
        }
        System.out.println();
    }

    public void addItemToOrder(int quantity, int productIndexInList){
        if (productIndexInList >= products.size()) return; //return if there is no such index
        for (OrderItem orderItem: orderItems){
            if (orderItem.product().type == products.get(productIndexInList).type){
                //Because of record is an immutable class, we cant just update quantity field,
                //so we need to:
                //calculate new quantity based of prior quantity and new
                int newQuantity = quantity + orderItem.quantity();
                //create new orderItem with new quantity and prior product
                OrderItem newOrderItem = new OrderItem(newQuantity,
                        Product.getProduct(orderItem.product().type,
                                orderItem.product().price,
                                orderItem.product().description));
                //remove prior orderItem
                orderItems.remove(orderItem);
                //add new orderItem
                orderItems.add(newOrderItem);
                return;
            }
        }
        orderItems.add(new OrderItem(quantity, products.get(productIndexInList)));
    }

    public void printProducts(){
        System.out.println();
        int index = 0;
        for (Product product: products){
            System.out.println(index);
            product.showDetails();
            index++;
            System.out.println("+".repeat(20));
        }
        System.out.println();
    }
}
