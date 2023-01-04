public class PassengerCars extends Car implements Competing{
    @Override
    public void startMovement() {

    }

    @Override
    public void stopMovement() {

    }

    @Override
    public void pitStop() {

    }

    @Override
    public int getBestLapTime() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    public PassengerCars(String brend, String model, float engineCapacity){
        super(brend,model,engineCapacity);
    }
    @Override
    public String toString(){
        return "бренд и модель:"/*+getBrend+"  "+getModel+"  двигатель  "+getEngineCapacity*/;
    }
}
