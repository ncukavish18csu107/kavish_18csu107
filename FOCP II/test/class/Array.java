import java.util.*;
public class Array
{
  
  public static void main(String[]args)
  {
  	int[] arr = new Int();
  	Scanner a = new Scanner(System.in);
  	
  	System.out.println("enter the value of n");
    int n = a.nextInt();
    
    System.out.println("enter the elements of array");
    for(int i=0 ; i<n ; i++)
    {
      arr[i] = a.nextInt();
    } 

    for(i=0 ; i<n ; i++) 
    {
      System.out.println(arr[i] + "");
    }   

    for(i=0 ; i<n ; i++)
    {
    	arr[i] = 0;
    	arr[n-1] = 0;
    }	

    System.out.println("array after moving zeroes");
   
    for(i=0 ; i<n ; i++)
    {
    	System.out.println(arr[i]);
    }	
      


  }





}