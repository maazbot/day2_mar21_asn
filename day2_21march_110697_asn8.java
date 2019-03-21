import java.util.*;

public class day2_21march_110697_asn8
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a postive integer.");
		int ans = scan.nextInt();
		
		UserMainCode umc = new UserMainCode();
		int total = umc.sumOfSquaresOfEvenDigits(ans);
		System.out.println(total);
		
		scan.close();
	}
}
