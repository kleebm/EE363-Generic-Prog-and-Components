public class UtilMethodGenerics<T> {

	public static <T> void exchange(T[] arr, int i1, int i2){
		T tmp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = tmp;
	}

}
