import java.util.*;

public class day2_21march_110697_asn9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.");
		
		int ans = scan.nextInt();
		
		UserMainCode umc = new UserMainCode();
		int sevenCount = umc.countSeven(ans);
		System.out.println(sevenCount);
		
		scan.close();
	}
}
