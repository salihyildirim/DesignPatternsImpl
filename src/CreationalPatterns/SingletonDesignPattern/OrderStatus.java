package CreationalPatterns.SingletonDesignPattern;

public enum OrderStatus {
    Kuryede("kuryede"),
    Hazirlaniyor,
    Dagitimda,
    TeslimEdildi;

    private int data;
    private String message; // New variable 'message'

    OrderStatus(String message) {
        this.message = message;
    }

    OrderStatus() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Other Singleton methods can be defined here
}
