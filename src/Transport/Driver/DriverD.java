package Transport.Driver;

import Transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, drivingExperience, car);
    }
    @Override
    public String toString() {
        return "Transport.Driver.Transport.Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", category='D"  + '\'' +
                ", drivingExperience=" + getDrivingExperience() +
                ", car=" + getCar() +
                '}';
    }

}
