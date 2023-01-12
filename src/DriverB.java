public class DriverB extends Driver<PassengerCars>{
    public DriverB(String fullName, int drivingExperience, PassengerCars car) {
        super(fullName, drivingExperience, car);
    }
    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", category='B"  + '\'' +
                ", drivingExperience=" + getDrivingExperience() +
                ", car=" + getCar() +
                '}';
    }
}
