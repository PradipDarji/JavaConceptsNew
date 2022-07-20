package JavaInputAndOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaFileOutputStream {
    public static void main(String[] args) throws Exception {
        try{
            FileOutputStream fs = new FileOutputStream("E:\\pradipdarji.txt");
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();//converting string into byte array
            fs.write(b);
            fs.close();
            System.out.println("success...");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
