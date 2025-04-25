
public class publicVehcile extends vehcile{
    int capacity;
    String routeNumber;

    public publicVehcile(String V_ID, String manufacture_name ,int capacity, String routeNumber) {
        super(V_ID, manufacture_name);
        this.capacity = capacity;
        this.routeNumber = routeNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public String toString() {
        return  super.toString() + ", Capacity: " + capacity + ", Route: " + routeNumber;
    }
    

 
    
    
    
    
}
