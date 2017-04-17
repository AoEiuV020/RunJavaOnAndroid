package aoeiuv020;
import java.util.*;
import java.io.*;
import com.sun.jna.*;
/**
 * Created by AoEiuV020 on 2017/04/15.
 */
public class Main{
    static{
        try{
            Class.forName(Platform.class.getName());
        }catch(Exception ignore){
        }
        System.setProperty("jna.nounpack","false");
    }
    public static void main(String[] args)throws Exception{
        C c=(C)Native.loadLibrary("c",C.class);
        c.printf("%s %f","hello",1.0/8);
    }
}
interface C extends Library{
    void printf(String format,Object... args);
}

