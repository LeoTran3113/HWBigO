package cm4structure;

public class TheFeast {
	
	public static void main(String[] args) {
		int amount = 15;
		int cost = 3;
		int wrapper = 2;
		
		getTotalChocolate(amount,cost,wrapper);
		
		System.out.println("Total Chocolate can have : " + getTotalChocolate(amount,cost,wrapper));
	}
		public static int getTotalChocolate(int amount, int cost, int wrapper ) {
			
			int chocolate = amount/cost;
			int m = chocolate;
			
			if(m < wrapper) {
				return chocolate;}
			else { while ( m >= wrapper) {
					chocolate = chocolate + 1;
					
					m = m - wrapper + 1;}
					
					return chocolate;}
			
		}
}


