package CreationalPatterns.SingletonDesignPattern;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    // static block initialization for exception handling
    static { // static blok sınıf yüklendiğinde yalnızca 1 kere çalışır.
        //yani burada singleton nesnesi yalnızca bir kez oluşturulur ve aynı nesne kullanılır
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
