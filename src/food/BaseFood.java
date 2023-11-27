package food;

public class BaseFood {
    private String size;
    private double prise;

    public BaseFood(String size) {
        this.size = size;
    }

    public BaseFood() {
        this("default");
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    public String getSize() {
        return size;
    }
    @Override
    public String toString() {
        return String.format("%S%s$%.2f%n", getSize().equalsIgnoreCase("default") ? "" : getSize() + " ", this.getClass().getSimpleName(), getPrise());
    }
}
