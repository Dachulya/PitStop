import static sun.swing.MenuItemLayoutHelper.max;

public class PassengerCars extends Car implements Competing{
    public static int[] SPISOK={13,34,2,1,45,67,8};

    @Override
    public int pitStop() {
        int randomNumm1 = (int)(Math.random()*10);
        return randomNumm1;
    }

    @Override
    public int getBestLapTime() {
        /*ArrayList<Integer> SPISOK = new ArrayList<>();
        return Collections.max(SPISOK);*/
        return max(SPISOK);
    }

    @Override
    public int getMaxSpeed() {
        int randomNummm = (int)(Math.random()*100);
        return randomNummm;
    }

    public PassengerCars(String brend, String model, float engineCapacity){
        super(brend,model,engineCapacity);
    }
    @Override
    public void startMovement(){
        System.out.println("НАчать движение");
    }
    @Override
    public void stopMovement(){
        System.out.println("Остановиться");
    }
}
