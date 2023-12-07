public abstract class Product {

    protected Type type;
    protected double price;
    protected String description;

    public Product(Type type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected abstract void showDetails();

    protected double getSalesPrice(int quantity){
        return quantity * this.price;
    }

    protected void printPrice(int quantity){
        System.out.println(this.type.getType(type) + " x " + quantity + ": " + quantity * this.price);
    }

    public static Product getProduct(Type type, double price, String description){
        return switch (type){
            case POTATOES -> new Potatoes(type, price, description);
            case CHICKEN -> new Chicken(type, price, description);
            case APPLE -> new Apple(type, price, description);
        };
    }
}
