import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int n,fact=1;
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		
		while(n!=0)
		{
		fact=fact*n;
		n=n-1;
			b=false;
		}
		System.out.println("factorial = "+fact);
		

	}

}
