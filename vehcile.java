
public class vehcile {
    private String V_ID ;
    private String manufacture_name ; 
    Sensor [] senoresreading =new Sensor[3] ;

    public vehcile(String V_ID, String manufacture_name) {
        this.V_ID = V_ID;
        this.manufacture_name = manufacture_name;
    }

    public String getV_ID() {
        return V_ID;
    }

    public String getManufacture_name() {
        return manufacture_name;
    }

    public Sensor[] getSenoresreading() {
        return senoresreading;
    }

    public void setVID(String V_ID) {
        this.V_ID = V_ID;
    }

    public void setManufacturename(String manufacture_name) {
        this.manufacture_name = manufacture_name;
    }

    public void setSenoresreading(Sensor[] senoresreading) {
        this.senoresreading = senoresreading;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + V_ID + ", Manufacturer: " + manufacture_name;
    }
    
   public String toString(boolean includeSensors) { //   Overloaded Method
        String details = toString(); 
        if (includeSensors) {
            details += ", Sensors: [";
            for (int i = 0; i < senoresreading.length; i++) {
                if (senoresreading[i] != null) {
                    details += senoresreading[i].toString()  + (i < senoresreading.length - 1 && senoresreading[i+1] != null ? "; " : "");
                }
            }
            details += "]";
        }
        return details;
    }
    
    
    
}
