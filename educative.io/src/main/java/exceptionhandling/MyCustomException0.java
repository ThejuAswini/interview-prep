package exceptionhandling;

//Checked Exception
class MyCustomException0 extends Exception{

    MyCustomException0(String message) {
        super(message);
    }
}

class MyClass {
    public static void main( String args[] ) {
        try{
            throw new MyCustomException0("result not found");
        }catch(MyCustomException0 e){
            System.out.print(e.getMessage());
        }
    }
}