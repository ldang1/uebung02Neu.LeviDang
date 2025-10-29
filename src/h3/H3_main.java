package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 2;
		int k = -10;
		
		if (i > j) { 
			
			if(i <= 200) {
				
				if (j <= 100)  {
					
					k = 1;
				}
			}
		}
	

		if (i > j) {
			
			if(i > 200) {
				
				if (j <= 100)  {
					
					k = 2;
				}
			}
		}
		

		if (i > j) {
			
			if(i > 200) {
				
				if (j > 100)  {
					
					k = 3;
				}
			}
		}
		

		if (i <= j) {
			
			if(i <= 200) {
				
				if (j <= 100)  {
					
					k = 4;
				}
			}
		}
	
		System.out.print("k ist " + k);
		
	
	}

}
