import static sun.swing.MenuItemLayoutHelper.max;

public class Bus extends Car implements Competing{

    private final PassengerCapacityBus passengerCapacityBus;

    public static int[] SPISOK={13,34,2,1,45,67,8};

    @Override
    public int pitStop() {
        int randomNumm = (int)(Math.random()*10);
        return randomNumm;
    }

    @Override
    public int getBestLapTime() {
        /*ArrayList<Integer> SPISOK = new ArrayList<>();
        return Collections.max(SPISOK);*/
        return max(SPISOK);
    }

    @Override
    public int getMaxSpeed() {
        int randomNum = (int)(Math.random()*100);
        return randomNum;
    }

    public Bus(String brend, String model, float engineCapacity,PassengerCapacityBus passengerCapacityBus){
        super(brend,model,engineCapacity);
        this.passengerCapacityBus=passengerCapacityBus;
    }
    @Override
    public void startMovement(){
        System.out.println("НАчать движение");
    }
    @Override
    public void stopMovement(){
        System.out.println("Остановиться");
    }

    @Override
    public void printType() {
        System.out.println(passengerCapacityBus);
    }
    @Override
    public void goDiagostic() {
        System.out.println("автобусу диагностика не требуется");
    }
    public String toString(){

        return "бренд и модель:"+getBrend()+"  "+getModel()+"  двигатель  "+getEngineCapacity()+passengerCapacityBus+
                "автобусу диагностика не требуется";
    }
}
