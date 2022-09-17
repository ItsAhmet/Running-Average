import java.util.Scanner;
public class RunningAverage {
public static void main(String Args[]) {
	int qs = 1;
	double avg = 0;
	double inp;

	Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println("Enter the first number:");
	inp = scan.nextDouble();	
	avg = inp+avg;
	
	
	System.out.println("The current average is: "+avg/qs);
	
	do {
		qs++;
		
		System.out.println("Enter the next number:");
		inp = scan.nextDouble();
		if(inp>0) {
			avg = avg+inp;
		}
		else {
			System.out.println("The final average is: "+avg/qs);
			
		}
		
		System.out.println("The current average is: "+avg/qs);
		
	}
	while(inp>=0);
}
}
