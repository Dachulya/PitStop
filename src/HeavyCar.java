import static sun.swing.MenuItemLayoutHelper.max;

public class HeavyCar extends Car implements Competing{

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

    public HeavyCar(String brend, String model, float engineCapacity){
        super(brend,model,engineCapacity);
    }
    @Override
    public void startMovement(){
        System.out.println("НАчать движение");
    }
    @Override
    public void stopMovement(){
        System.out.println("Остановиться");
    }}


