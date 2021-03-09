package exceptionhandling;

import java.io.IOException;

public class Example10 {
    public static void main( String args[] ) {
        try{
            readFile1("filename.text");
        }catch(IOException e) {
            System.out.println("Caught in main!");
        }
    }

    public static void readFile(String path) throws RuntimeException{ //UncheckedException
        //code here
        System.out.println("Reading File");
    }

    public static void readFile1(String path) throws IOException { //Checked Exception
        //code here
        System.out.println("Reading File");
        throw new IOException("No file");
    }
}
