import java.util.*;

public class day2_21march_110697_asn6 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String status;
		
		System.out.println("Is the coach here? Yes or No.");
		status = scan.nextLine();
		String ans = coachCheck(status);
		System.out.println();
		System.out.println(ans);

	}
	
	public static String coachCheck(String str)
	{
		String action;
		if(str.equals("Yes") || str.equals("yes"))
			action = "Keeping.";
		else if (str.equals("No") || str.equals("no"))
			action = "Batting.";
		else
			action = "Invalid input.";
		return action;
	}
	
	scan.close();
}
