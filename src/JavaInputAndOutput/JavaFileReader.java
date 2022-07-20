package JavaInputAndOutput;

import com.sun.deploy.panel.IProperty;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;

public class JavaFileReader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("E:\\pradip.txt");
            Properties pp = new Properties();
            pp.load(fr);
            System.out.println(pp.getProperty("Name"));

            Enumeration ee = pp.propertyNames();
            for(; ee.hasMoreElements();){
                System.out.println(ee.nextElement());
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
