/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes*/

/*
 You can use a inbuild class as well.
 
 StringBuilder sb=new StringBuilder(s);
 sb.reverse();
 String sb1=sb.toString(); we need to assign it to a string because sb is an object.
 
  now the sb1 is carrying the reverse of string s. (The Java StringBuilder reverse() method is 
 used to reverse the characters of a StringBuilder object. It replaces the sequence of characters in reverse order. The method 
 is a static method with predefined logic for reversing a string in Java.
The reverse() method does not accept any parameters, and it does not throw any exception while reversing the character's sequence.) 
 */
package HR_String;
import java.util.Scanner;
public class Java_String_Reverse {
	
	public static void main(String[] Args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String rev="";
		for(int i=s.length();i>0;--i) {
			rev=rev+(s.charAt(i-1));
		}
		System.out.println(s.equals(rev)?"Yes":"No");
	}

}
