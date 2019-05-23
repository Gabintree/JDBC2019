package java20190411;

public class Java20190411_3 {

	public static void main(String[] args) {
        	int[] arr = {20, 2, 10, 4, 5, 6, 7};        
     System.out.println("ÃÖ¼Ú°ª: " + ArrayMinMax.minValue(arr));
     System.out.println("ÃÖ´ñ°ª: " + ArrayMinMax.maxValue(arr));
    }
}

class ArrayMinMax {
		public static int minValue(int[] arr ) {
		
		int tmp;
		
		tmp = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			if(tmp > arr[i]) {
				tmp = arr[i];
			}
		}
 		return tmp;
}
	public static int maxValue(int[] arr) {
		
		int tmp;
		
		tmp = arr[0];
		
		for(int i =1; i < arr.length; i++ ) {
			if(tmp <arr[i]) {
				tmp = arr[i];
			}
		}
		return tmp;
	}
}

