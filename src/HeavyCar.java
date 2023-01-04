public class HeavyCar extends Car implements Competing{

    public HeavyCar(String brend,String model,float engineCapacity){
        super(brend,model,engineCapacity);}
    @Override
    public void startMovement(){
    }
    @Override
    public void stopMovement(){
    }
    @Override
    public String toString(){
        return "бренд и модель:"/*+getBrend+"  "+getModel+"  двигатель  "+getEngineCapacity*/;
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
}


