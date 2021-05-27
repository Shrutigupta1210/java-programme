import java.util.Scanner;
public class Reverse_No {

	public static void main(String[] args) {
		int n,rem,leng=0;
		
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a no");
	     n=sc.nextInt();
	     int t=n;
	     while(t!=0)
	     {
	    	 t=t/10;
	    	 leng=leng+1;
	    	 
	     }
	    int t1=n;
	    	 for(int i=1;i<=leng;i++)
	    	 {
	    		 while(t1!=0)
	    	     {
	    	rem=t1%10;
	    	System.out.print(rem);
	    	t1=t1/10;
	    	     }
	    	
	    	 }
	     
	}   

	}


