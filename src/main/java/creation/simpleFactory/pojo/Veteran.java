package creation.simpleFactory.pojo;

public class Veteran extends User {

    // Attributes
    private boolean ageAccess;
    private int points;

    // Example method
    public String print() {
        return "Print something";
    }

    // Getters & Setters
    public boolean isAgeAccess() {
        return ageAccess;
    }

    public void setAgeAccess(boolean ageAccess) {
        this.ageAccess = ageAccess;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
