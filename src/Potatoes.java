public class Potatoes extends Product {


    public Potatoes(Type type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        String details = "";
        details += String.format("%s:%nprice: %.2f%ndescription: %s", type.getType(type), price, description);
        System.out.println(details);
    }
}
