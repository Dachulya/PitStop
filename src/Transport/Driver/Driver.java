package Transport.Driver;

import Transport.Car;

public class Driver<T extends Car> {
    private final String fullName;

    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName,int drivingExperience,T car){
        this.fullName=fullName;

        this.drivingExperience=drivingExperience;
        this.car=car;
    }

    public void startMovement(){
        System.out.println("Начал движение");
        System.out.println(this.fullName);
        this.car.startMovement();
    }

    public void stopMovement(){
        System.out.println("Остановился");
        System.out.println(this.fullName);
        this.car.stopMovement();
    }

    public void relife(){
        System.out.println("Запрваил авто");
        System.out.println(this.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public T getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Transport.Driver.Transport.Driver{" +
                "fullName='" + fullName + '\'' +
                ", category='"  + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", car=" + car +
                '}';
    }
}