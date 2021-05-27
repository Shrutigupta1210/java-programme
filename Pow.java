import java.util.Scanner;
	public class Pow {
		public static void main(String[] args)
		{
			int a,exp;
			double result;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no which you want to find power");
			a=sc.nextInt();
			System.out.println("enter the exponential value");
			exp=sc.nextInt();
			result=Math.pow(a,exp);
			System.out.println("power of"+a+"="+result);
		}
}
