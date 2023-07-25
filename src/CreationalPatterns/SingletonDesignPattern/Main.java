package CreationalPatterns.SingletonDesignPattern;

public class Main {

    public static void main(String [] args){

        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        enumSingleton.setData(45);

        int data = enumSingleton.getData();
        System.out.println(data);
        String orderStatusMessage = OrderStatus.Kuryede.getMessage();

    }
}
