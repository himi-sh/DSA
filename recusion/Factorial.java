public class Factorial {
    public static void main(String[] args) {
        System.out.println(recFactorial(5));
        System.out.println(itFactorial(5));
    }

    private static int recFactorial(int num) {
        if (num == 1 || num == 2) {
            return num;
        }

        return num * recFactorial(num-1);
    }

    private static int itFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}