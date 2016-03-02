import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class Functions {

	/**
	 * function that takes as input a sorted array and modifies the array to compact it, removing duplicates.
	 * Notes: The input array might be very large. 
	 * @param input
	 * @return
	 */
	public Object[] compactArray(Object[] input){
		Vector<Object> v=new Vector<Object>(0);
		int j=0;
		v.addElement(input[0]);
		for (int i = 1; i < input.length; i++) {
			if(input[i]!=input[j]){
				v.addElement(input[i]);
				j=i;
			}
		}
		return  v.toArray();
	}
	/**
	 * function that takes as input a sorted array and modifies the array to compact it, removing duplicates.
	 * Notes: The input array might be very large. 
	 * @param input
	 * @return
	 */
	public Object[] compactArrayWithSet(Object[] input){
		return (new HashSet<Object>(Arrays.asList(input))).toArray();
	}
	
	
	/**
	 * function that takes an array of integers and efficiently calculates and returns the LCM
	 * @param tab the array of integers
	 * @return
	 */
	public int lcm (int [] tab){
		int lcm = tab[0];
		for (int i = 0; i < tab.length-1; i++) {
			lcm = lcm(lcm,tab[i+1]);
		}
		return lcm;
	}
	
	/**
	 * function that takes two integers and efficiently calculates and returns the LCM
	 * @param a first integer
	 * @param b second integer
	 * @return
	 */
	public int lcm(int a , int b) {
		int product, rest;
		if(a==0 || b==0) return 0;		
		product = a*b;
		rest = a%b;
		while(rest != 0){
			a = b;
			b = rest;
			rest = a %b;
		}				
		return product/b;
	}
	
	/**
	 * function that takes an array of integers and returns that array rotated by N positions.
	 * @param tab the array of integers
	 * @param n 
	 * @return
	 */
	public int [] rotateArray(int [] tab, int n){
		int [] result = new int [tab.length];
		for (int i = 0; i < tab.length; i++) {
			int j =(i+n)%tab.length;
			result[j] = tab[i];
		}
		return result;
	}
	/**
	 * function with signature find_chars(string1, string2) that takes two strings and returns a string that
	 * contains only the characters found in string1 and string two in the order that they are found in string1
	 * N*N implementation
	 * @param string1
	 * @param string2
	 * @return
	 */
	public String find_chars_NN(String string1, String string2){
		String result="";
		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j <string2.length(); j++) {
				if(string1.charAt(i) ==string2.charAt(j)){
					result = result+string2.charAt(j); 
					break;
				}
					
			}
		}
		return result;
	}
	
	/**
	 * function with signature find_chars(string1, string2) that takes two strings and returns a string that
	 * contains only the characters found in string1 and string two in the order that they are found in string1
	 * N implementation
	 * @param string1
	 * @param string2
	 * @return
	 */
	public String find_chars_N(String string1, String string2){
		String result="";
		for (int i = 0; i < string1.length(); i++) {
				if(string2.contains(String.valueOf(string1.charAt(i))))
					result = result+string1.charAt(i); 
		}
		return result;
	}
}
