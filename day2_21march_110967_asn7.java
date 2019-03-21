import java.util.*;

/*We are only counting the completed overs.*/

public class day2_21march_110967_asn7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int ans1, ans2, ans3;
		System.out.println("How many overs have been played so far?");
		ans1 = scan.nextInt();
		System.out.println("How many balls have been played so far?");
		ans2 = scan.nextInt();
		System.out.println("How many total overs in this inning?");
		ans3 = scan.nextInt();
		
		whoLetDhoniOut(ans1, ans2, ans3);
		
		scan.close();
	}
	
	public static void whoLetDhoniOut(int overs, int balls, int total)
	{
		
		if(overs >= total)
			System.out.println("Yes.");
		else
			System.out.println("No.");
	}
	
}
