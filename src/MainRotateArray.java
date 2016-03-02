
public class MainRotateArray {

	public static void main(String[] args) {
		Functions f = new Functions();
		int [] tab = {1,2,4,3,5};
		int [] result = f.rotateArray(tab, 2);
		for (int i : result) {
			System.out.println(i+" ");
		}
	}

}
