import java.util.Scanner;
public class Check_Prime_No {

	public static void main(String[] args) {
		int n;
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
			
		}
		if(prime==true)
			System.out.println("prime no");
		else
			System.out.println("not prime");
		// TODO Auto-generated method stub

	}

}
