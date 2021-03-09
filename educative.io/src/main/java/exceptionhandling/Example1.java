package exceptionhandling;

//Can we throw multiple exceptions?

public class Example1 {
    public static void main( String args[] ) {

        try{
            throw new NullPointerException(); // exception 1

            //unreachable statement so won't compile
            //throw new ArithmeticException();  // exception 2
        }catch(Exception e){
            System.out.print(e);
        }

    }
}
