public class Singleton {
    private static volatile Singleton obj;

    private Singleton() {}

    public static getInstance() {
        if (obj == null) {
            synchronized(Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
