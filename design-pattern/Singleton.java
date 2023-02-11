public class Singleton {
    private static Singleton obj;

    private Singleton() {}

    public static getInstance() {
        if (null == obj) {
            obj = new Singleton();
            return obj;
        } else {
            return obj;
        }
    }
}
