package Transport;

import com.sun.jdi.connect.Transport;

public class Mechanic {
    private final String name;
    private final String company;
    private final MechanicType type;

    public Mechanic(String name, String company, MechanicType type) {
        this.name = name;
        this.company = company;
        this.type = type;
    }
    public  void doMaintenance(){
        System.out.printf("Механик %s из %s проводит техобслуживание ",name,company);
    }
    public void repairCar(Transport car){
        System.out.printf("Чиним машину: %s ",car.toString());
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public MechanicType getType() {
        return type;
    }
}

