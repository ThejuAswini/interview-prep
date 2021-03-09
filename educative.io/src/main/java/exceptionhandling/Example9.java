package exceptionhandling;

public class Example9 {
    public static void main( String args[] ) {
        System.out.print("Returned Value is: "+method1());
    }

    public static int method1() {
        int value = 1;
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            value = 2;
            System.out.println("Exception caught value is "+ value);
            return value; // value is being returned inside catch
        }finally{
            value = 3;
            System.out.println("Finally value is now "+ value);
            return value; // value is being returned inside finally
        }

    }
}
/*
The finally block will still execute, even if the catch block has a return statement.
If both catch and finally return, the receiving method will get the returned value from the finally block.
 */