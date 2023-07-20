package CreationalPatterns.FactoryDesignPattern;

public class BMW implements ICar{

    private String color;
    private double price;

    public BMW(String color,double price){
        this.color=color;
        this.price=price;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
