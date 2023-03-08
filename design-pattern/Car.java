public class Car implements Iterable<String> {
    private String[] cars;
    private int length;
    private int index;

    Car() {
        this.cars = new String[10];
        this.length = cars.length;
    }

    public void addCars(String car) {

        // when cars length exceeds
        // if (index == cars.length) {
        //     String[] largerCars = new String[cars.length + 5];
        //     System.arraycopy(cars, 0, largerCars, 0, cars.length);
        //     cars = largerCars;
        //     largerCars = null;
        //   }
          cars[index] = car;
          index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            private int currentIndex = 0;
 
            // Method 3
            // Finding whether during iteration if
            // there is next element or not
            @Override
            public boolean hasNext() {
                return currentIndex < cars.length && cars[currentIndex] != null;
            }
        
            // Method 4
            // Going to grab each car element by one by one
            // according to the index
            @Override
            public String next() {
                return cars[currentIndex++];
            }
        
            // Method 5
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return it;
    }
}
