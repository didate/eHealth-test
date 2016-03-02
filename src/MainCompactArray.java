
public class MainCompactArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f = new Functions();
		
		//Object [] input = {1,1,2,2,4,5,6,6,7};
		
		Object [] input = {'a','a','b','b','c','c','e'};
		
		Object[] result = f.compactArray(input );
		for (Object i : result) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nCompact Array with Set");
		Object[] result2 = f.compactArrayWithSet(input );
		
		for (Object i : result2) {
			System.out.print(i+" ");
		}
	}
	
	

}
