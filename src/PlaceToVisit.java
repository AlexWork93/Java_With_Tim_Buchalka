public class PlaceToVisit {

    private String name;
    private int distanceFromStartPoint;

    public PlaceToVisit(String name, int distanceFromStartPoint) {
        this.name = name;
        this.distanceFromStartPoint = distanceFromStartPoint;
    }

    public String getName() {
        return name;
    }

    public int getDistanceFromStartPoint() {
        return distanceFromStartPoint;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.distanceFromStartPoint);
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equalsIgnoreCase(((PlaceToVisit) obj).getName())
                && this.getClass().equals(obj.getClass());
    }
}
