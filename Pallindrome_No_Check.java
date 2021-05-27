import java.util.Scanner;
public class Pallindrome_No_Check {

	public static void main(String[] args) {
		  int n,c,r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(c==s)
			System.out.println("PALLINDROME NO");
		else
			System.out.println("NOT PALLINDROME ");
		

	}

}
