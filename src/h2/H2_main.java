package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 2;
		int k = 3;
		int min = 4;
		int max = 5;
		
		if(i < j && i < k) {
			
			min = i;
		}

		if(j < i && j < k) {
			
			min = j;
		}
		
		if(k < j && k < i) {
			
			min = k;
		}
	
		System.out.print("min:" + min);

		if(i > j && i > k) {
			
			max = i;
		}

		if(j > k && j > k) {
			
			max = j;
		}
		
		if(k > j && k > i) {
			
			max = k;
		}
	
		System.out.print("max:" + max);
	
	}

}
