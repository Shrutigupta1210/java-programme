import java.util.Scanner;
public class Addition_Of_No_And_Character {
	public static void main(String[] args)
	{
		int a,b;
		String s1,s2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the two no");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter two characters");
		s1=sc.next();
		s2=sc.next();
		System.out.println("addition of no is"+(a+b));
	    System.out.println("addition of character is:"+(s1+s2));
        }
	}
