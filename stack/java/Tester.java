public class Tester {
    public static void main(String[] args) {
        StackUsingArray<Integer> stack = new StackUsingArray(Integer.class ,  5);
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);

        stack.print();
    }
}
