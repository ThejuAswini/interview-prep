package exceptionhandling;

/*
Multiple exceptions can also be caught in a single catch clause using the pipe, |, operator.
 */
public class Example4 {
    public static void main( String args[] ) {
        int a = 1;
        int b = 0;

        try{
            // exception thrown here
            System.out.print(a/b);
        }catch(ArithmeticException|NullPointerException e){
            // exception caught here
            System.out.print("A");
        }
    }
}
