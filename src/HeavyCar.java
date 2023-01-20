import static sun.swing.MenuItemLayoutHelper.max;

public class HeavyCar extends Car implements Competing{

    public static int[] SPISOK={13,34,2,1,45,67,8};
    private final CarriageCapacity carriageCapacity;
    private boolean diagnostic;

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

    public HeavyCar(String brend, String model, float engineCapacity,CarriageCapacity carriageCapacity,boolean diagnostic){
        super(brend,model,engineCapacity);
        this.carriageCapacity=carriageCapacity;
        this.diagnostic=diagnostic;
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
        System.out.println(carriageCapacity);
    }

    @Override
    public void goDiagostic() {
        System.out.println(diagnostic);
    }

    public String toString(){
        return "бренд и модель:"+getBrend()+"  "+getModel()+"  двигатель  "+getEngineCapacity()+carriageCapacity+diagnostic;
    }
}


