import java.util.*;
public class book
{
  int bookId;
  int yop;
  String bookName;
  String department;
  String author;

  public static void main(String[]args)
  {
  	Scanner a = new Scanner(System.in);
  	int n;
  	System.out.println("enter the value of n");
  	int n = a.nextInt();
  	if(n==1)
  	{
  		System.out.println("insert details");
  	}	

  	else if(n==2)
  	{
  		System.out.println("display details of a book");
  	}

  	else
  	{
  		System.out.println("display details of all the books");
  	}	

  }	
}
