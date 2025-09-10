package BasicNumberProg;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Any value");
	int num=sc.nextInt();
	
	int spy1=0;int spy2=1;
	
	while(num!=0)
	{
		int rem=num%10;
		
	    spy1+=rem;
	     spy2*=rem;
	    
	    num/=10;
	}
	if(spy1==spy2)
	{
		System.out.println("Spy Number");
		
	}
	else
	{
		System.out.println("Not spy Number");
	}
}

}
