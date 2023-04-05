import java.lang.reflect.Array;

public class StackUsingArray<T> {
    int top;
    T[] arr;
    int size;

    StackUsingArray(Class<T> clazz, int size) {
        this.top = -1;
        this.size = size;
        this.arr = (T[]) Array.newInstance(clazz, size);
    }

    public void push(T element) {
        if (this.isFull()) {
            System.out.println("Stack is Full");
        } else {
            this.top++;
            this.arr[top] = element;
            
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T element = this.arr[top];
            this.top--;
            return element;
        }
    }

    public T peek() {
        return this.arr[this.top];
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public boolean isEmpty() {
        return this.top < 0;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(this.arr[i]);
        }
    }
}
