public abstract class Car {
    private String brend;
    private String model;
    private float engineCapacity;

    public Car(String brend,String model,float engineCapacity){
        this.brend=brend;
        this.model=model;
        this.engineCapacity=engineCapacity;

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
