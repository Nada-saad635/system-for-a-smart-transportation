
public class Drone extends AutonomousVehicle {
    private double flightAltitude;
    private String cameraResolution;

    public Drone(String V_ID, String manufacture_name , String aiModelVersion, boolean canBeRemoteControlled , double flightAltitude, String cameraResolution) {
        super(V_ID, manufacture_name,aiModelVersion, canBeRemoteControlled);
        this.flightAltitude = flightAltitude;
        this.cameraResolution = cameraResolution;
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setFlightAltitude(double flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Altitude: " + flightAltitude + " m, Camera: " + cameraResolution;
    }
    
    
    
}
