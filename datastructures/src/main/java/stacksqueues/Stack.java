package stacksqueues;

public class Stack<T> {
    private int maxSize;
    private int top;
    private T arr[];

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1; //initially stack is empty
        arr = (T[]) new Object[maxSize];
    }

    public int getCapacity() {
        return maxSize;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public T top() {
        if (isEmpty())
            return null;
        return arr[top];
    }

    public void push(T value) {
        if (!isFull()) {
            arr[++top] = value;//increments the top and adds value to updated top
        }
        else {
            System.err.println("Stack is Full!");
        }
    }

    public T pop(){
        if (!isEmpty()) {
            return arr[top--];//returns value of top and decrements the top
        }else {
            return null;
        }
    }
}
