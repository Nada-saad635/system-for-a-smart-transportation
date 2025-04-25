public class Main
{
    public static void main(String[] args) {
        // TODO code application logic here
        vehcile[] vehicles = new vehcile[10];
        vehicles[0] = new bus("B101", "Volvo", 50, "R1", 20, true);
        vehicles[1] = new MetroTrain("M205", "Siemens", 200, "L2", 5, 120.0);
        vehicles[2] = new ElectricCar("E302", "Tesla", "Alice", true, 400.0, "CS001");
        vehicles[3] = new Drone("D401", "DJI", "v2.0", true, 100.0, "4K");
        vehicles[4] = new DeliveryRobot("R503", "Starship",false, "v1.5", "Sidewalk", 20.0);
        vehicles[5] = new privateVehcile("P601", "BMW", "Bob", false);
        vehicles[6] = new bus("B102", "Mercedes", 45, "R1", 22, false);
        vehicles[7] = new Drone("D402", "Parrot", "v1.8", true, 80.0, "1080p");
        vehicles[8] = new vehcile("V001", "Generic");
        vehicles[9] = new ElectricCar("E303", "Nissan", "Charlie", true, 350.0, "CS002");
        
        vehicles[0].senoresreading[0] =  new Sensor("Temperature", 25.5, "2025-04-21 10:00:00");
        vehicles[0].senoresreading[1] =  new Sensor("Speed", 60.0, "2025-04-21 10:00:05");
        vehicles[2].senoresreading[0] =  new Sensor("Temperature", 22.0, "2025-04-21 10:01:00");
        vehicles[3].senoresreading[0] =  new Sensor("Temperature", 18.0, "2025-04-21 10:02:00");
        vehicles[3].senoresreading[1] =  new Sensor("Wind Speed", 15.2, "2025-04-21 10:02:05");
        vehicles[4].senoresreading[0] =  new Sensor("Temperature", 26.1, "2025-04-21 10:03:00");
        vehicles[4].senoresreading[1] =  new Sensor("Temperature", 26.5, "2025-04-21 10:03:05");
        vehicles[4].senoresreading[2] =  new Sensor("Temperature", 27.0, "2025-04-21 10:03:10");

 
        int busCount = 0;
        int metroTrainCount = 0;
        int electricCarCount = 0;
        int droneCount = 0;
        int deliveryRobotCount = 0;
        int autonomousVehicleCount = 0;
    
        
        vehcile mostTempVehicle = null;
        int maxTempreading = 0;
        
        for(int i = 0;i<vehicles.length;i++){
           if( vehicles[i] instanceof bus) busCount++;
           else if( vehicles[i] instanceof MetroTrain ) metroTrainCount++;
           else if( vehicles[i] instanceof bus) electricCarCount ++;
           else if( vehicles[i] instanceof Drone){
               droneCount++;
               autonomousVehicleCount++;
           }
           else if( vehicles[i] instanceof DeliveryRobot){
               deliveryRobotCount++;
               autonomousVehicleCount++;
           }
           else if( vehicles[i] instanceof AutonomousVehicle) autonomousVehicleCount++;
           int tempcount =0;
           if(vehicles[i].getSenoresreading()!= null){
               Sensor[] sensorReadings = vehicles[i].getSenoresreading();
               for(int j = 0;j<vehicles[i].senoresreading.length;j++){
                   Sensor S1 = (Sensor) sensorReadings[j] ;
                   if(S1 != null && S1.getType().equals("Temperature")){
                       tempcount++ ;
                   }
               }
               if(maxTempreading<tempcount) {
                 maxTempreading =  tempcount;
                 mostTempVehicle = vehicles[i];
                
            }  
            
           }
        }
        
        System.out.println("The total number of autonomous Veciles " +autonomousVehicleCount++);
        System.out.println("The vehicle that has the highest number of sensor readings of type \n" +
                           "\"Temperature\" is : " + mostTempVehicle);
        
        
    }
    
    
}

