package stacksqueues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack<Integer> testObj = new Stack<>(5);

    @Test
    void getCapacity() {
    }

    @Test
    void isEmpty() {
        System.out.println("\nIs Stack empty? \n" + testObj.isEmpty());
    }

    @Test
    void isFull() {
        System.out.println("\nIs Stack full? \n" + testObj.isFull());
    }

    @Test
    void top() {
    }

    @Test
    void push() {
        System.out.print("Elements pushed in the Stack: ");
        for (int i = 0; i < 5; i++) {
            testObj.push(i); //pushes 5 elements (0-4 inclusive) to the stack
            System.out.print(i + " ");
        }
    }

    @Test
    void pop() {
        System.out.print("Elements popped from the Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(testObj.pop()+" "); //pops all 5 elements from the stack and prints them
        }
    }
}