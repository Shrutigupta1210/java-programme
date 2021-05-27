import java.util.Scanner;
public class Sum_Of_Natural_Number {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		
	
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;  
	    
		}
 System.out.println("sum of natural no is "+sum);
	}

}
