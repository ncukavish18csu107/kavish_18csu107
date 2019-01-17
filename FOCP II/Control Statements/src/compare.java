import java.util.*
class compare
{
	public static void main(String[]args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("enter the nos. you want to compare");
		double x = z.nextDouble();
		double y = z.nextDouble();
		if(x==y)
			System.out.println("the nos. are equal");
		else 
			System.out.println("nos. not equal");
	} 
}