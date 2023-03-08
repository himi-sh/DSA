public class IteratorDP {
    public static void main(String[] args) {
        Car cars = new Car();
 
        // Adding cars to the Array
        cars.addCar("Dodge");
        cars.addCar("Ferrari");
        cars.addCar("Sedan");
    
        // Creating an Iterator and pointing the cursor
        // to the index just before the first element in cars
        Iterator<String> carIterator = cars.iterator();
    
        // Checking whether the next element is available or not
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }
    }
}
