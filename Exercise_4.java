// So, for whatever reason, this program works until n = 13 or more. It starts multiplying in strange ways and I tried troubleshooting but it just doesn't make sense.
public class Exercise_4 {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	
	public static int factorial(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			int result = 1;
			for(int i = n; i > 0; i--)
			{
				System.out.println(i);
				result = result * i;
				System.out.println(result);
				System.out.println("");
			}
			return result;
		}
	}

}
