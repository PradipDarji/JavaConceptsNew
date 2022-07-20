package JavaInputAndOutput;

import java.io.FileWriter;
import java.util.Properties;

public class JavaFileWriter {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("E:\\pradip.txt");
            Properties pp = new Properties();
            pp.setProperty("Name","Pradip Darji");
            pp.setProperty("Dept","QA");
            pp.store(fw,"Created by Pradip Darji");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
