public class Bus extends Car implements Competing{
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

    public Bus(String brend, String model, float engineCapacity){
        super(brend,model,engineCapacity);
    }
    @Override
    public void startMovement(){
        System.out.println("НАчать движение");
    }
    @Override
    public void stopMovement(){
    }
    @Override
    public String toString(){
        return "бренд и модель:"/*+getBrend+"  "+getModel+"  двигатель  "+getEngineCapacity*/;
    }
}
