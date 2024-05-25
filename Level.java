import java.util.ArrayList;
import java.util.List;

import parkinglot.vehicletype.Vehicle;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingShot;

    public Level(int floor, int numSpots){
        this.floor = floor;
        parkingShot = new ArrayList<>(numSpots);
        for(int i=0;i<numSpots;i++){
            parkingShot.add(new ParkingSpot(i));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot shot : parkingShot){
            if(shot.isAvailable() && shot.getVehicleType() == vehicle.getType()){
                shot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot shot : parkingShot){
            if(!shot.isAvailable() && shot.getParkedVehicle().equals(vehicle)){
                shot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
    public void displayAvailability() {
        System.out.println("Level " + floor + " Availability:");
        for (ParkingSpot spot : parkingShot) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available" : "Occupied"));
        }
    }
}
