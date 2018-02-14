
public class Exercise_3 {

	public static void main(String[] args) {
		System.out.println(power(2, 2));
		System.out.println(power(3, 3));
		System.out.println(power(5, 10));

	}
	
	public static double power(double x, int n)
	{
		double y = x;
		for(int i = 1; i < n; i++)
		{
			x = x * y;
		}
		return x;
	}

}
