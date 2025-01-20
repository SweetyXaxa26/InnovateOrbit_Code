package code_in_ArrayList;

import java.util.ArrayList;

public class Programing_code_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(67);
		al.add(34);
		al.add(23);
		al.add(89);
		al.add(27);
		al.add(35);
		al.add(98);
		al.add(86);
		al.add(69);
		al.add(56);
		
		System.out.println(al);
		
		System.out.println();
		
		for(int i=0;i< al.size();i++)
		{
		 
			System.out.print(al.get(i)+" ");
		
		}

	}

}
