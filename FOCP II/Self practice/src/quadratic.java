import java.util.*;
class quadratic
{
	public static void main(String[]args)
	{
		Scanner coeff = new Scanner(System.in) ;
		System.out.println("enter the values of a coefficients of quad. eqn.");
		int num1 = coeff.nextInt();
		int num2 = coeff.nextInt();
        int num3 = coeff.nextInt();

		int root1 , root2 ;

		root1 = -num2/num1 ;
		root2 = num3/num1 ; 

		System.out.println("roots of a quad. eqn." + root1 " and " + root2);

	}
}