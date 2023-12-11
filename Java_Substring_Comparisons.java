/*We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.*/

package HR_String;
import java.util.Scanner;
public class Java_Substring_Comparisons {

	public static void main(String[] Args) {
		Scanner scan=new Scanner(System.in);
		String s= scan.nextLine();
		int k=scan.nextInt();
		System.out.println(getsmallestandlargest(s,k));
	}

	public static String getsmallestandlargest(String s, int k) {
		
		String small=s.substring(0,k);
		String large=s.substring(0,k);
		for(int i=1;i<=s.length()-k;i++) {/* why i is starting with 1 not 0 ? - I already have a string which need to be compared with,
			which is starting from (0,k).from so if i need to compare it with next occuring substrings, i need to point the start index
			next value of 0, which is 1. Why i need to iterate s.length()-k ? - because the string which need to compare already having
			the first 3 values.If I remove the "-k" error will be "Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 11, end 14, length 13"
			Which means in the last iteration the line 65 will look for an 14 index of a passed string which is not there, because 
			the length of the string is 13*/
			String currstring=s.substring(i,i+k);
			if(currstring.compareTo(small)>0) {
				small=currstring;
			}
			if(currstring.compareTo(large)<0) {
				large=currstring;
			}
		}
		return large+"\n"+small;

		
		
	}
}
