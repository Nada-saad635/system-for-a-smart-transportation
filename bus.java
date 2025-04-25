
public class bus extends publicVehcile  {
    int numStops;
    boolean hasWheelchairAccess;

    public bus(String V_ID, String manufacture_name , int capacity, String routeNumber,int numStops, boolean hasWheelchairAccess ) {
        super(V_ID, manufacture_name ,capacity, routeNumber );
        this.numStops = numStops;
        this.hasWheelchairAccess = hasWheelchairAccess;
    }

    public int getNumStops() {
        return numStops;
    }

    public boolean isWheelchairAccess() {
        return hasWheelchairAccess;
    }



    public void setNumStops(int numStops) {
        this.numStops = numStops;
    }

    public void setWheelchairAccess(boolean wheelchairAccess) {
        this.hasWheelchairAccess = wheelchairAccess;
    }

    @Override
    public String toString() {
        return super.toString() + ", Stops: " + numStops + ", Wheelchair Access: " + hasWheelchairAccess;
    }
    



     
}
