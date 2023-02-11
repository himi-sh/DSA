public class Singleton {
    private static Singleton obj = new Singleton();

    private Singleton() {}

    public static getInstance() {
        return obj;
    }
}
