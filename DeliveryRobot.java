
public class DeliveryRobot extends AutonomousVehicle  {
    private String terrainType;
    private double deliveryCapacity;

    public DeliveryRobot(String V_ID,String aiModelVersion, boolean canBeRemoteControlled, String manufacture_name,String terrainType, double deliveryCapacity ) {
        super(V_ID, manufacture_name ,aiModelVersion, canBeRemoteControlled);
        this.terrainType = terrainType;
        this.deliveryCapacity = deliveryCapacity;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public double getDeliveryCapacity() {
        return deliveryCapacity;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public void setDeliveryCapacity(double deliveryCapacity) {
        this.deliveryCapacity = deliveryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Terrain: " + terrainType + ", Capacity: " + deliveryCapacity + " kg";
    }
    
    
    
    
}
