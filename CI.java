
public class CI
{
	public static void main(String[] args)
	{
	int p=20000; float r=0.06f; 
	double ci;
    double amt;
    amt=p*(Math.pow((1+r),3));
    System.out.println("amount is"+amt);
    ci=amt-p;
    System.out.println("compound interest is"+ci);
	}
}
