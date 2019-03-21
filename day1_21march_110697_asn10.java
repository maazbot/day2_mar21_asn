import java.util.*;

public class day1_21march_110697_asn10
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number!");
		int n1 = scan.nextInt();
		System.out.println("Enter the second number!");
		int n2 = scan.nextInt();
		
		UserMainCode umc = new UserMainCode();
		boolean flag = umc.compareLastDigit(n1, n2);
		System.out.println(flag);
		scan.close();
	}
}
