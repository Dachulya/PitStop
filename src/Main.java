import Transport.*;
import Transport.Driver.Driver;
import Transport.Driver.DriverB;
import Transport.Driver.DriverC;
import Transport.Driver.DriverD;
import Transport.Type.BodyType;
import Transport.Type.CarriageCapacity;
import Transport.Type.PassengerCapacityBus;
import com.sun.jdi.connect.Transport;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bus bus1=new Bus("bmv","w-234",23.4f, PassengerCapacityBus.XS);
        Bus bus2=new Bus("skoda","p4",20.4f,PassengerCapacityBus.M);
        Bus bus3=new Bus("mersedes","o-24",23.0f,PassengerCapacityBus.L);


        PassengerCars car1=new PassengerCars("bmv","w-2",23.4f,BodyType.SEDAN,true);
        PassengerCars car2=new PassengerCars("skoda","rapid",12.4f, BodyType.VAN,false);
        PassengerCars car3=new PassengerCars("toyota","popo-24",28.0f,BodyType.MINIVAN,false);

        HeavyCar carr1=new HeavyCar("bmv","wue-234",23.4f, CarriageCapacity.N1,true);
        HeavyCar carr2=new HeavyCar("skoda","antirapid",2.4f,CarriageCapacity.N3,false);
        HeavyCar carr3=new HeavyCar("toyota","toto",18.0f,CarriageCapacity.N2,true);

        /*System.out.println(bus1);
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
        System.out.println(carr3.pitStop());*/

        DriverB driverB = new DriverB("Пётр Сергеевич", 34, car1);

        Driver driver2=new DriverD("Пётр Сергеевич1",30, bus1);
        Driver driver3=new DriverC("Пётр Сергеевич2",26,  carr1);


        //System.out.println(driver2);
        //System.out.println();
        Mechanic mechanic1=new Mechanic("Павел","remove", MechanicType.BUS);
        Mechanic mechanic2=new Mechanic("Павел2","remove2", MechanicType.CAR);
        Mechanic mechanic3=new Mechanic("Павел","remove", MechanicType.ALL);

        Sponsor sponsor1=new Sponsor("енот",true,4567);

        mechanic1.doMaintenance();
        car1.addMechanic(mechanic1);
        bus1.addMechanic(mechanic2);
        //mechanic1.repairCar((Transport) carr1);
        car1.addSponsor(sponsor1);

        car1.getSponsors();
        car1.setDriver(driverB);
        System.out.println(car1.getSponsors());
        System.out.println(List<Sponsor>);




    }
}