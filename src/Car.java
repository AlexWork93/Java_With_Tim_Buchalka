public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return String.format("%s -> startEngine()", this.getClass().getSimpleName());
    }

    public String accelerate() {
        return String.format("%s -> accelerate()", this.getClass().getSimpleName());
    }

    public String brake() {
        return String.format("%s -> brake()", this.getClass().getSimpleName());
    }
}
