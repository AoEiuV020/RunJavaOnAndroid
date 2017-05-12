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
        JSONArray arr = new JSONArray("[null]");
        assertTrue(arr.optString(0, null) != null);
        assertTrue(arr.optString(1, null) == null);
        assertTrue(arr.getString(0) != null);
        JSONObject obj = new JSONObject("{\"key\" = null}");
        assertTrue(obj.optString("key", null) != null);
        assertTrue(obj.optString("none", null) == null);
        assertTrue(obj.getString("key") != null);
	}
    private static void assertTrue(boolean b) {
        if (!b) {
            throw new AssertionError();
        }
    }
}

