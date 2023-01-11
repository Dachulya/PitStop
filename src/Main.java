public class Main {
    public static void main(String[] args) {
        Bus bus1=new Bus("bmv","w-234",23.4f,PassengerCapacityBus.XS);
        Bus bus2=new Bus("skoda","p4",20.4f,PassengerCapacityBus.M);
        Bus bus3=new Bus("mersedes","o-24",23.0f,PassengerCapacityBus.L);


        PassengerCars car1=new PassengerCars("bmv","w-2",23.4f,BodyType.SEDAN);
        PassengerCars car2=new PassengerCars("skoda","rapid",12.4f,BodyType.VAN);
        PassengerCars car3=new PassengerCars("toyota","popo-24",28.0f,BodyType.MINIVAN);

        HeavyCar carr1=new HeavyCar("bmv","wue-234",23.4f,CarriageCapacity.N1);
        HeavyCar carr2=new HeavyCar("skoda","antirapid",2.4f,CarriageCapacity.N3);
        HeavyCar carr3=new HeavyCar("toyota","toto",18.0f,CarriageCapacity.N2);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(carr1);
        System.out.println(carr2);
        System.out.println(carr3);

        System.out.println(bus2.getBestLapTime());
        System.out.println(bus1.getBestLapTime());
        System.out.println(bus3.getBestLapTime());

        System.out.println(car1.getMaxSpeed());
        System.out.println(car2.getMaxSpeed());
        System.out.println(car3.getMaxSpeed());

        System.out.println(carr1.pitStop());
        System.out.println(carr2.pitStop());
        System.out.println(carr3.pitStop());

        Driver<PassengerCars> driver1=new Driver<>("Пётр Сергеевич","B",34, car1);
        Driver driver2=new Driver("Пётр Сергеевич1","D",30, bus1);
        Driver driver3=new Driver("Пётр Сергеевич2","C",26,  carr1);


        System.out.println(driver1);





    }
}