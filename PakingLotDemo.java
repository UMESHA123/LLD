import parkinglot.vehicletype.Car;
import parkinglot.vehicletype.MotorCycle;
import parkinglot.vehicletype.Truck;
import parkinglot.vehicletype.Vehicle;

public class PakingLotDemo {
    public static void main( String args[]){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 5));

        Vehicle truck = new Truck("truknd112");
        Vehicle truck1 = new Truck("truknd11112");
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(truck1);
        parkingLot.displayAvailability();
        parkingLot.unparkVehicle(truck);
        parkingLot.displayAvailability();
      
        //car
        ParkingLot carParkingLot = ParkingLot.getInstance();
        carParkingLot.addLevel(new Level(2, 5));

        Vehicle car = new Car("car1jj23");
        Vehicle car1 = new Car("car1234");
       
        carParkingLot.parkVehicle(car);
        carParkingLot.displayAvailability();
    }
}
