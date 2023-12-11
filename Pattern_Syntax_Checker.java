/*Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output

Valid
Invalid
Invalid*/

package HR_String;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Pattern_Syntax_Checker {

	public static void main(String[] Args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();// declaring nextLine() immediately after nextInt(), it will consider it as new line. so adding dummy nextLine().
		while(n>0) {
				String s=scan.nextLine();//D/B next() and nextLine() - next() will stop reading the input when it saw the space.
				                         // nextLine() will read the input completely unit user press the enter button.
				patternchecker(s);
				--n;
		}
	}
	public static void patternchecker(String s) {
		
		try {
			Pattern.compile(s);// The compile() method of Pattern class is used to compile the given regular expression passed as 
			                   //the string. It used to match text or expression against a regular expression more than one time.
			System.out.println("Valid");
		}catch(Exception e) {
			System.out.println("Invalid");
		}
	}
}
