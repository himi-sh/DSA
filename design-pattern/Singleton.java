public class Singleton {
    private static Singleton obj;

    private Singleton() {}

    public static synchronized getInstance() {
        if (null == obj) {
            obj = new Singleton();
            return obj;
        } else {
            return obj;
        }
    }
}
