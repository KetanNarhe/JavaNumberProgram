package BasicNumberProg;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Value");
		int num=sc.nextInt();
		
		int temp=num;
		int arm=0;
		int count=0;
		
		while(num!=0)
		{
			int rem=num%10;
			
			arm=(rem*rem*rem)+arm;
			
			num/=10;
			
			count++;
		}
		if(temp==arm)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}

}
