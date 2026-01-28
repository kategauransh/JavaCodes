
public class Truck extends Vehicle implements ElectricVehicle {
    @Override
    public void showType() {
        System.out.println("Vehicle Type: Truck");
    }

    @Override
    public void showHybridFeature() {
        System.out.println("Hybrid Feature: Electric Assist Enabled");
    }
}
