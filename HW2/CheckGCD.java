import java.lang.System;

public class CheckGCD{
	public static void main(String[] args){
		BasicNum check = new BasicNum();
		System.out.println(check.gcd(2,9));
		System.out.println(check.gcd(2,4));
		System.out.println(check.gcd(75,50));
		System.out.println(check.gcd(8,1));
		System.out.println(check.gcd(3,0));
		System.out.println(check.gcd(0,8));
		System.out.println(check.gcd(9,12));
		System.out.println(check.gcd(30,40));
		System.out.println(check.gcd(12,24));
		System.out.println(check.gcd(0,0));
	}

}
