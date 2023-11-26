public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void gasPoweredHi(){
        System.out.println("Hi");
    }
}
