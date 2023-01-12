public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, drivingExperience, car);
    }
    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", category='D"  + '\'' +
                ", drivingExperience=" + getDrivingExperience() +
                ", car=" + getCar() +
                '}';
    }

}
