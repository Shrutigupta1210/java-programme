import java.util.Scanner;
public class Check_Armstrong_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
int a=sc.nextInt();
int t1=a;

int leng=0,rem,arm=0;
while(t1!=0)
{
	t1=t1/10;
	leng=leng+1;
}
int t2=a;
	while(t2!=0)
	{ 
		int mul=1;
		rem=t2%10;
		for(int i=1;i<=leng;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
	}
	if(arm==a)
		System.out.println("ARMSTRONG NO");
	else
		System.out.println("NOT ARMSTRONG NO");
	}
}

