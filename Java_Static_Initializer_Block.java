/*Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive*/

package Introduction_HR;
import java.util.Scanner;
public class Java_Static_Initializer_Block {
	
	static int b;
	static int h;
	
	static {
		Scanner scan=new Scanner(System.in);
		b = scan.nextInt();
		h= scan.nextInt();
		scan.close();
		
		if(b<=0 || h<=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			System.exit(0);
		}
	}
	public static void main(String[] Args) {
		System.out.println(b*h);
	}

}

/* static block is used initialize the static variable only once. For example you are having one class with 2 variable and 1 static
variable, you are creating 3 objects and calling them. Each and every time that static variable will be called. To avoid it we are
going to a static block. The static block will execute only one time that too when the class gets loaded. What is class loading ?
In JVM there will be a special area called as class loader. When you create an object the class will gets load and the object will
be instantiated(creating new instances of objects). The thing is even you create multiple object, the object will instantiate multiple
time but the class will load only once that executes the static block.*/
