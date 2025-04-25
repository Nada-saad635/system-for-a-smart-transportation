
public class MetroTrain extends publicVehcile{
    private int carriageCount;
    private double maxSpeed;

    public MetroTrain(String V_ID, String manufacture_name , int capacity, String routeNumber,int carriageCount, double maxSpeed ) {
        super( V_ID, manufacture_name ,capacity, routeNumber);
        this.carriageCount = carriageCount;
        this.maxSpeed = maxSpeed;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carriages: " + carriageCount + ", Max Speed: " + maxSpeed + " km/h";
    }
    
    
    
    
}
