package exceptionhandling;

/*
In the code above, Number Format Exception and ArithmeticException are both derived classes of Exception Class,
which is in the first catch clause. This means that even if these exceptions are thrown specifically,
they will be handled by the Exception catch clause.
Hence, the control will never reach the other catch clauses.
 */
public class Example2 {
    public static void main( String args[] ) {

        try{
            // exception thrown here
            throw new NumberFormatException();
        }catch(NumberFormatException e){
            System.out.print("B");
            // Unreachable statement here
        }catch(ArithmeticException e){
            System.out.print("C");
            // Unreachable statement here
        }catch(Exception e){
            // exception caught here
            System.out.print("A");
        }

    }
}
