package code_in_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Programing_code_Conversion_07 {

	public static void main(String[] args) {
		
		Integer arr[]= {5,8,45,97,34,34,56,23,26,85,29,73,62};
		
		List<Integer> al = new ArrayList<>(Arrays.asList(arr));
		
		Collections.sort(al);
		
		System.out.println(al);
		

	}

}
