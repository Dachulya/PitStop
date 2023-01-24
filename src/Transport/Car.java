package Transport;


import Transport.Driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private String brend;
    private String model;
    private float engineCapacity;
    private final List<Sponsor> sponsors=new ArrayList<>();
    private final List<Mechanic> mechanics=new ArrayList<>();
    private Driver<?> driver;//лююого водителя


    public Car(String brend,String model,float engineCapacity){
        this.brend=brend;
        this.model=model;
        this.engineCapacity=engineCapacity;

    }

    public void addSponsor(Sponsor sponsor){
        this.sponsors.add(sponsor);
    }
    public void addMechanic(Mechanic mechanic){
        this.mechanics.add(mechanic);
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setDriver(Driver<?> driver) {
        this.driver = driver;
    }
    public Driver<?> getDriver() {
        return driver;
    }

    public String getBrend() {
        return brend;
    }



    public String getModel() {
        return model;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }
    public abstract void startMovement();
    public abstract void stopMovement();
    public abstract void printType();
    public abstract void goDiagostic();

    @Override
    public String toString(){
        return "бренд и модель:"+getBrend()+"  "+getModel()+"  двигатель  "+getEngineCapacity();
    }

}
