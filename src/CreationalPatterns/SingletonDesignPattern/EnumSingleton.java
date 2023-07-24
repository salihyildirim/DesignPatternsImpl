package CreationalPatterns.SingletonDesignPattern;

public enum EnumSingleton {
    INSTANCE; // Tek bir örnek (instance) oluşturmak için enum sabiti

    // Singleton'a özgü iş mantığı burada tanımlanabilir
    // Örneğin:
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    // Diğer Singleton metotları burada tanımlanabilir
}
