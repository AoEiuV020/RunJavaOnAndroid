package aoeiuv020;
import java.util.*;
import java.io.*;
import java.net.*;
import groovy.lang.*;
/**
 * @author AoEiuV020
 * @version 1.0 , 2017/03/14
 */
public class Main{
	public static void main(String[] args)throws Exception{
		GroovyShell gs=new GroovyShell();
		gs.evaluate("println 'ready'");
		Scanner in=new Scanner(System.in);
		while(in.hasNextLine()){
			String line=in.nextLine();
			Object ret=gs.evaluate(line);
			System.out.println("==> "+ret);
		}
		System.out.println(""+in.hasNextLine());
	}
}

