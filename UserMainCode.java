public class UserMainCode 
{
	public static int rem;
	public static int num;
	
	public UserMainCode()
	{
		rem = 0;
		num = 1;
	}
	
	public static int sumOfSquaresOfEvenDigits(int dig)
	{
		int sum = 0;
		num = dig;
		
		while (num != 0)
		{
			rem = num % 10;
			num = num / 10;
			
			if(rem%2 == 0)
				sum += (rem * rem);
		}
		
		return sum;
	}
	
	public static int countSeven(int truck)
	{
		int count = 0;
		num = truck;
		
		while(num != 0)
		{
			rem = num % 10;
			num = num / 10;
			
			if(rem == 7)
				count++;
		}
		return count;
	}
	
	public static boolean compareLastDigit(int d1, int d2)
	{
		int d1rem = d1 % 10;
		int d2rem = d2 % 10;
		
		if (d1rem == d2rem)
			return true;
		else
			return false;
	}
}
