import java.util.Arrays;
import java.lang.Float;

public class TestExchange2{
	
	public static void main(String[] args){
		Float[] arr = new Float[8];
		arr[0] = 1.2f;
		arr[1] = 3.4f;
		arr[2] = 21f;
		arr[3] = 34.5f;
		arr[4] = 54.3f;
		arr[5] = 9f;
		arr[6] = 45.6f;
		arr[7] = 100f;				
		System.out.println(Arrays.toString(arr));
		UtilMethodGenerics.<Float>exchange(arr,2,7);//Switchs 3rd and last element
		System.out.println(Arrays.toString(arr));
	}

}
