import parkinglot.vehicletype.Vehicle;
import parkinglot.vehicletype.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber){
        this.spotNumber = spotNumber;
        this.vehicleType = VehicleType.TRUCK;
    }
    public boolean isAvailable(){
        return parkedVehicle == null;
    }
    public synchronized void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType() == vehicleType){
            parkedVehicle = vehicle;
        }else{
            throw new IllegalArgumentException("Invalig vehicle type or vechicle already exits");
        }
    }
    public synchronized void unparkVehicle(){
        parkedVehicle = null;
    }
    public int getSpotNumber(){
        return this.spotNumber;
    }
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
    public Vehicle getParkedVehicle(){
        return this.parkedVehicle;
    }

}
