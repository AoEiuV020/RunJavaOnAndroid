package aoeiuv020;
import java.util.*;
import java.io.*;
import okhttp3.*;
/**
 * @author AoEiuV020
 * @version 1.0 , 2017/03/16
 */
public class Main{
	public static void main(String[] args)throws Exception{
		OkHttpClient client=new OkHttpClient.Builder().build();
		Request request=new Request.Builder()
			.url("http://baidu.com")
			.build();
		Response response=client.newCall(request).execute();
		System.out.println(response.body().string());
	}
}

