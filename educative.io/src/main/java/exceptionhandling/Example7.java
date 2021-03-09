package exceptionhandling;

//try-finally block
public class Example7 {
    public static void main( String args[] ) {
        int month = 5;
        int salary = 0;

        try{
            System.out.print(month/salary);// Will throw an ArithmeticException
        }finally{ // this is an optional block
            // will always be executed
            System.out.println("Finally executed");
        }
    }
}
