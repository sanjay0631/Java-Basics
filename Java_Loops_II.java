/* "REFER HACKERRANK FOR MORE DETAILS" We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.*/

package Introduction_HR;
import java.util.Scanner;

public class Java_Loops_II {

	public static void main(String[] Args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for (int i=0;i<t;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int n=scan.nextInt();
			int res=a;
			for(int j=0;j<n;j++) {
				res+=b*Math.pow(2,j); //Math class in java is a trignometric or numerical operation performing class, so the 
				                      //result might be a float value, so it cannot be assigned to a int variable. But if multiply 
				                      //it with some other in variable it will convert into int type.
				System.out.println(res+" ");
			}
			System.out.println();
		}
	}
}
