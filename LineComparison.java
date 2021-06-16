import java.util.Scanner;
public class LineComparison {
	//variables
	public static float length;
	public static float line1;
	public static float line2;
	public static int x1,x2,y1,y2;
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Line Comparison Computation Problem\n");
		//Calculating Length for Line 1 by taking values
		System.out.println("Enter The values for Line 1\n");
		length();
		System.out.println("Length of LINE-1 b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length+"\n");
		length=line1;
		//Calculating Length for Line 2 by taking values
		System.out.println("Enter The values for Line 2\n");
		length();
		System.out.println("Length of LINE-2 b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length+"\n");
		length= line2;
		//Comparing the line lengths
		if (line1==line2) {
			System.out.println("Length of LINE-1 & LINE-2 are equal.");
		}
		else {
			System.out.println("Length of LINE-1 & LINE-2 are not equal.");
		}	
	}
	
	//Computing the length b/n two Cartesian points
	public static void length(){
		Scanner scan = new Scanner(System.in);
		//scanningg user input values
		System.out.println("Enter the x1 value for Line:");
		x1=scan.nextInt();
		System.out.println("Enter the y1 value for Line:");
		y1=scan.nextInt();
		System.out.println("Enter the x2 value for Line:");
		x2=scan.nextInt();
		System.out.println("Enter the y2 value for Line:");
		y2=scan.nextInt();
		//Calculating the length using formula
		length=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
	}
}