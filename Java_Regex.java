/*Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56
Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)

Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
Sample Output

true
true
true
false
false
false*/

package HR_String;
import java.util.Scanner;
public class Java_Regex {
	public static void main(String[] args) {
	    // Create a Scanner object to read input from the console.
	    Scanner input = new Scanner(System.in);

	    // Continuously read input as long as there are more tokens (words) available.
	    while (input.hasNext()) {
	      // Read the next token (IP Address) from the input.
	      String ip = input.next();

	      // Create an instance of the MyRegex Class and check if the input IP Address matches the defined pattern.
	      // Print the result (true if it matches, false if it doesn't).
	      System.out.println(ip.matches(new MyRegex().pattern));
	    }
	  }
	}

	class MyRegex {
		
	  // `[0-9]` matches single digit from `0 to 9`.
	  // `[0-9][0-9]` matches double digits from `00 to 99`.
	  // `[01][0-9][0-9]` matches three digits from `000 to 199`
	  // `2[0-4][0-9]` matches three digits from `200` to 249.
	  // `25[0-5]` matches three digits from `250` to `255`.
	  // `\\.` matches the `.` (dot) character.

	  // Hence, the regex to match 3 digits from `000 to 255`: `[0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5]`

	  // Regular expression pattern for validating an IPv4 address
	  String pattern = "(([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|[01][0-9][0-9]|2[0-4][0-9]|25[0-5])";
	}

