package StructuralPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args){
//Bir nesneye dinamik olarak yeni özellikler eklemek için kullanılır.
// CarDecorator adlı sınıf, Car arayüzünü uygulayan nesnelerin davranışını değiştirmek veya genişletmek için bir tasarım deseni olan Decorator Deseni'ni kullanır.

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
