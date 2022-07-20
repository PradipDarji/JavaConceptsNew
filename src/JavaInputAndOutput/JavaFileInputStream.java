package JavaInputAndOutput;

import java.io.FileInputStream;

public class JavaFileInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("E:\\pradipdarji.txt");
            int i=fi.read();
            System.out.print((char)i);

            fi.close();
        }catch (Exception e){

        }
    }
}
