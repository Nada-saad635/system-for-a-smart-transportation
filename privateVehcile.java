
public class privateVehcile extends vehcile {
    private String ownerName;
    private boolean isElectric;

    public privateVehcile(String vehicleID, String manufacturerName, String ownerName, boolean isElectric) {
        super(vehicleID, manufacturerName);
        this.ownerName = ownerName;
        this.isElectric = isElectric;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isIsElectric() {
        return isElectric;
    }



    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Owner: " + ownerName + ", Electric: " + isElectric;
    }

    
  
    
}
