import java.lang.System;

public class TestSum {
	public static void main(String[] args){
		ArrSum arr = new ArrSum();
		
		int[] a = {9,9,9,9};
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		int[] c = {10,4,6,5,7,14};

		System.out.println(arr.sum(a));
		System.out.println(arr.sum(b));
		System.out.println(arr.sum(c));

	}

}
