import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int n=sc.nextInt();
	boolean rs=isEvenOdd(n);
	if(rs)
	   System.out.println("Even");
	else
	   System.out.println("Odd");
    }
    public static boolean isEvenOdd(int n)
    {
	if(n%2==0)
	   return true;
	return false;
    }
}
public static prime(int n)
{
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}