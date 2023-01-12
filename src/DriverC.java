public class DriverC extends Driver<HeavyCar>{
    public DriverC(String fullName, int drivingExperience, HeavyCar car) {
        super(fullName, drivingExperience, car);
    }
    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", category='C"  + '\'' +
                ", drivingExperience=" + getDrivingExperience() +
                ", car=" + getCar() +
                '}';
    }
}
