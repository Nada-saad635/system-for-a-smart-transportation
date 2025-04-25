
public class AutonomousVehicle extends  vehcile  {
    private String aiModelVersion;
    private boolean canBeRemoteControlled;

    public AutonomousVehicle(String V_ID, String manufacture_name ,String aiModelVersion, boolean canBeRemoteControlled) {
        super(V_ID, manufacture_name);
        this.aiModelVersion = aiModelVersion;
        this.canBeRemoteControlled = canBeRemoteControlled;
    }

    public String getAiModelVersion() {
        return aiModelVersion;
    }

    public boolean isCanBeRemoteControlled() {
        return canBeRemoteControlled;
    }

   

    public void setAiModelVersion(String aiModelVersion) {
        this.aiModelVersion = aiModelVersion;
    }

    public void setCanBeRemoteControlled(boolean canBeRemoteControlled) {
        this.canBeRemoteControlled = canBeRemoteControlled;
    }

    @Override
    public String toString() {
        return super.toString() + ", AI Model: " + aiModelVersion + ", Remote Control: " + canBeRemoteControlled;
    }

  

   
    
}
