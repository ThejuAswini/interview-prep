package exceptionhandling;

public class Example8 {
    public static void main( String args[] ) {
        int value = 5;

        System.out.println("Value returned: "+findNumber(value));
    }

    public static int findNumber(int value){
        Integer[] arr = null;

        try{
            System.out.println(arr[0]);
        }catch(NullPointerException e){
            // exception caught here
            return value;
        }finally{ // this is an optional block
            // will always be executed
            System.out.println("Finally executed");
        }
        return value;
    }
}

/*
Here, when the NullPointerException is caught,
the catch clause has a return statement, which should return the control to main.
However, before doing that, finally is executed.
 */