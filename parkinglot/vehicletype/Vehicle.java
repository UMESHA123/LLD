package parkinglot.vehicletype;

public class Vehicle {
    protected String licencePlate;
    protected VehicleType type;
    public Vehicle(String licensePlate, VehicleType type1){
        this.licencePlate = licensePlate;
        this.type = type1;
    }
    public VehicleType getType(){
        return this.type;
    }
}
