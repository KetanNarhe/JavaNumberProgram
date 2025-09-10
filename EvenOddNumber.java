package BasicNumberProg;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any value");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("It is even Numbers");
		}
		else
		{
			System.out.println("It is odd Number");
		}
	}

}
