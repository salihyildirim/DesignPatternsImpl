package CreationalPatterns.FactoryDesignPattern;

public class Main {


    public static void main(String []args){

        ICar myBmw=CarFactory.createCar("BMW","Blue",12.500);
        System.out.println(myBmw.getColor());

        ICar myBmw2 = CarFactory.createAbstractCar(BMW.class,"red",12.600);
        System.out.println(myBmw2.getPrice());

    }
}
