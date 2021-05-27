import java.util.Scanner;

public class Even_Odd_Sum {

	public static void main(String[] args) {
		int n,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		while(n!=0)
		{
			if(n%2==0)
			{
				even=even+n;
			}
			else
				odd=odd+n;
		
	n=n-1;
		}
	
	System.out.println("sum of even  no="+even);
	System.out.println("sum of odd no="+odd);

	}

}
