public class ArrSum {

	public ArrSum(){
	}

	//@requires: a.length() != 0
	//@modifies: nothing
	//@ensures:returns all elements in a added together, if a is empty returns -1 
	public static int sum(int[] a){
		int x =0;
		if(a.length == 0)
			return -1;
		else{
			for(int b:a)
				x += b;
			return x;
		}
	}

}
