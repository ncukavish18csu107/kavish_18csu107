import java.util.*;
class license 
{
	public static void main(String[]args)
	{

      Scanner scan = new Scanner(System.in);
      int age = scan.nextInt();

      try
      {
      	if(age<18)
      		throw new Exception("you cant drive");
      	else 
      		System.out.println("you can drive");
	  }

	  catch(Exception e)
	  {
	  	e.getMessage();
	  }

	  finally
	  {
	  	System.out.println("block is always executed");
	  } 

	  System.out.println("rest...");

	}  
}