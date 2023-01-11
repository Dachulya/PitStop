
public class Driver<T extends Car> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName,String category,int drivingExperience,T car){
        this.fullName=fullName;
        this.category=category;
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

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", category='" + category + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", car=" + car +
                '}';
    }
}