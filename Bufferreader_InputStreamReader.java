/*bufferedReader - bufferreader is a used to read a input from user, by default it will take a input as string.
InputStreamReader - The InputStreamReader class of the java.io package can be used to convert data in bytes into data in characters.
Integer.parseInt - The parseInt() function parses a string argument and returns an integer of the specified radix.
Why Exception needs for readline() - It is possible for a file system read to fail due to a wide range of reasons at any given time. 
This situation could be even more severe if the Reader is obtaining its underlying data from a Network Stream.. If it throws an item,
 it indicates a problem with your standard input.*/

package Introduction_HR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferreader_InputStreamReader {
   
	public static void main(String[] Args) throws Exception{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		String str=br.readLine();
		System.out.println(str);
		int a= Integer.parseInt(br.readLine());
		System.out.println(a);
		float d=Float.valueOf(br.readLine()).floatValue();
		System.out.println(d);
	}
}
