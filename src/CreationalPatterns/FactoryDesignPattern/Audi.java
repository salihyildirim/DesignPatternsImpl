package CreationalPatterns.FactoryDesignPattern;

public class Audi implements ICar{
    private String color;
    private double price;

    public Audi(String color, double price){
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }


    public double getPrice() {
        return price;
    }
}

