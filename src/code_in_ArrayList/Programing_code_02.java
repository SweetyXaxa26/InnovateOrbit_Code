package code_in_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Programing_code_02 {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		
		al.add(67);
		al.add(34);
		al.add(23);
		al.add(89);
		al.add(27);
		al.add(35);
		al.add(98);
		al.add(86);
		al.add(56);
		
		System.out.println(al);
		
		System.out.println();
		
		//for each loop 
		
		for(int each : al  )
		{
			System.out.println(each);
		}
		
		

	}

}
