/*You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
For example:

Username	Validity
INVALID; Username length < 8 characters
VALID
VALID
INVALID; Username begins with non-alphabetic character
INVALID; '?' character not allowed
Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

Input Format

The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

Constraints

The username consists of any printable characters.
Output Format

For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
Explanation 0

Refer diagram in the challenge statement.*/

package HR_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_Username_regular_experssion {
	 public static void isValidUsername(String s) {
		    // Regular expression pattern to match valid usernames.
		    String regex = "^[a-zA-Z][\\w]{7,29}";

		    // Compile the regular expression pattern.
		    Pattern pat = Pattern.compile(regex);
		    // Create a Matcher object to match the input string with the pattern.
		    Matcher mat = pat.matcher(s);

		    // Check if the input string matches the pattern.
		    if (mat.matches()) {
		      // If it does, print `Valid`.
		      System.out.println("Valid");
		    } else {
		      // If it doesn't, print `Invalid`.
		      System.out.println("Invalid");
		    }
		  }

		  public static void main(String[] args) {
		    // Create a Scanner object to read input from the console.
		    Scanner input = new Scanner(System.in);

		    // Read the total number of usernames to validate.
		    int totalUsernames = Integer.parseInt(input.nextLine());

		    // Process each username.
		    for (int i = 0; i < totalUsernames; i++) {
		      // Read the username from the input.
		      String username = input.nextLine();

		      // Call the `isValidUsername` method to validate the username.
		      isValidUsername(username);
		    }

		    // Close the Scanner object to prevent resource leak.
		    input.close();
		  }
}
