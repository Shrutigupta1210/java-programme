import java.util.Scanner;
public class Greatest_No {

	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.println("enter 3 no's");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>n2&&n1>n3)
			System.out.println("largest no= "+n1);
		else if(n2>n3&&n2>n1)
		System.out.println("largest= "+n2);
		else
			System.out.println("largest=  "+n3);
	}
}
