package code_in_ArrayList;

import java.util.ArrayList;

public class Programing_code_08 {

	public static void main(String[] args) {
		
		// arraylist ----> array 
		
		ArrayList<Integer> alt = new ArrayList<>();
		
		alt.add(67);
		alt.add(45);
		alt.add(82);
		alt.add(25);
		alt.add(32);
		alt.add(39);
		System.out.println("values in collections : "+alt );
		
		System.out.println();
		int arr[]= new int [alt.size()];
		
		int i=0;
		
		for(int each : alt)
		{
			arr[i]=each ;
			i++;
		}
		
		System.out.println("values in array ");
		for(int val : arr)
		{
			System.out.println(val );
		}
		
		
	}

}
