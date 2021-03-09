package exceptionhandling;

public class Example5 {
    public static void main( String args[] ) {

        try{
            throw new NullPointerException();
        }catch(Exception e){
            // exception caught/handled here
            System.out.println("Exception caught");
        }finally{ // this is an optional block
            // will always be executed
            System.out.println("Finally executed");
        }
    }
}
