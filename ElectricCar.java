
public class ElectricCar extends privateVehcile {
    private double batteryRange;
    private String chargingStationID;

    public ElectricCar(String vehicleID, String manufacturerName, String ownerName, boolean isElectric ,double batteryRange, String chargingStationID) {
        super(vehicleID, manufacturerName, ownerName, isElectric);
        this.batteryRange = batteryRange;
        this.chargingStationID = chargingStationID;
    }

    public double getBatteryRange() {
        return batteryRange;
    }

    public String getChargingStationID() {
        return chargingStationID;
    }

    public void setBatteryRange(double batteryRange) {
        this.batteryRange = batteryRange;
    }

    public void setChargingStationID(String chargingStationID) {
        this.chargingStationID = chargingStationID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Battery Range: " + batteryRange + " km, Charging Station ID: " + chargingStationID;
    }
    
}
