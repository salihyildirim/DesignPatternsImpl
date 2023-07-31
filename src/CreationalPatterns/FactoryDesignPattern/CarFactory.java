package CreationalPatterns.FactoryDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarFactory { // nesne üretiminin gerceklesecegi sinif.

    //Factory Method. (static ve yazdıgımız interface tipinde olmalıdır.)
    public static ICar createCar(String mark, String color, double price) {
        ICar car;

        if (mark.equals("BMW")) {
            car = new BMW(color, price);
        } else if (mark.equals("Audi,")) {
            car = new Audi(color, price);
        } else {
            throw new RuntimeException(mark + "Markasının üretimi desteklenmemektedir.");
        }
        return car;
    }


          //AbstractFactory

    //    public static ICar createCar(Class carClass) {
//
//        try{
//            return (ICar) carClass.newInstance();
//        }
//        catch (Exception e){
//            System.out.println("Belirtilen marka desteklenmemektedir.");
//            return null;
//        }
//
//    }

    //AbsractFactory with constructor.
    //Bu sayede devamlı if eklemek yerine kodu hiç değiştirmezsin.
    public static ICar createAbstractCar(Class<? extends ICar> carClass, String color, double price) {
        try {
            // Get the constructor with the required parameters
            Constructor<? extends ICar> constructor = carClass.getDeclaredConstructor(String.class, double.class);

            // Create a new instance using the constructor and provided arguments
            return constructor.newInstance(color, price);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            System.out.println("Belirtilen marka desteklenmemektedir.");
            return null;
        }
    }

}
