package aoeiuv020;
import java.util.*;
import java.io.*;
import org.json.*;
/**
 * @author AoEiuV020
 * @version 1.0 , 2017/03/16
 */
public class Main{
	public static void main(String[] args)throws Exception{
		JSONObject object=new JSONObject("{\"age\":22}");
		System.out.println(object.toString(4));
	}
}

