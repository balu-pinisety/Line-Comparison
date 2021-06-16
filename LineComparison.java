import java.util.Scanner;
public class LineComparison {
	
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Welcome to Line Comparison Computation Problem\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x1 value for Line:");
		int x1=scan.nextInt();
		System.out.println("Enter the y1 value for Line:");
		int y1=scan.nextInt();
		System.out.println("Enter the x2 value for Line:");
		int x2=scan.nextInt();
		System.out.println("Enter the y2 value for Line:");
		int y2=scan.nextInt();
		float length=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("Length of LINE b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length);
	}
}