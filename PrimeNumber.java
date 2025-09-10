package BasicNumberProg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any value");
		int num=sc.nextInt();
		int i;
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(num==i)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not prime ");
		}
	}

}
