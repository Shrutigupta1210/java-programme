import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("numbers are:"+a+"   "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("after swapping numbers:"+a+"   "+b);
		

	}

}
