public class BasicNum{
	//int z;//gcd

	public BasicNum(){
	}
	
	//@requires: !(X==0 && y==0)
	//@signals_only: ZeroException (a user defined, checked exception)
	//@ensures: throws ZeroException if both x and y are zero, otherwise returns the gcd of x and y
	public static int gcd(int x,int y){
		int z = 1; // gcd
		int i = 1;
		if(x==0 && y==0)
			throw new ZeroException("Can't have 2 zeros");
		else if(x==0)
			return y;
		else if(y==0)
			return x;
		else{
			while((z <=x && z <=y)  &&(i<=x && i<=y)){
			if(x%i == 0 && y%i ==0)
				z =i;
			i++;
			}
			return z;	 
		}
	}

}
