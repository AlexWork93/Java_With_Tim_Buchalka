public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    protected void startEngine(){
        System.out.println(this.getClass().getSimpleName() + " engine is started");
    }

    protected void drive(){
        runEngine();
        System.out.println(this.getClass().getSimpleName() + " engine is driving");
    }

    private void runEngine(){
        System.out.println(this.getClass().getSimpleName() + " engine is run");
    }
}
