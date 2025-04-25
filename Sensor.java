
public class Sensor {
 private String type ;
 private double value ;
 private String timeStamp ;

    public Sensor(String type, double value, String timeStamp) {
        this.type = type;
        this.value = value;
        this.timeStamp = timeStamp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Value: " + value + ", Timestamp: " + timeStamp;
    }
 
 
 
}
