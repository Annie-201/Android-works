package Genpact_Day_4;

import java.util.ArrayList;

public class Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s =new ArrayList<>();
		s.add("ACD22XD");s.add("ACV22XM");
		s.add("ACV21XD");s.add("ACB21XR");
		s.add("ACD19XL");s.add("ACR22QD");
		s.add("ACV22XD");s.add("ACB19RD");
		s.add("ACX20XG");s.add("ACR22LD");
		s.add("ACX22XD");s.add("ACD22RD");
		
		ArrayList<String> batch22 = new ArrayList<String>();
		int count=0;
		for(int i=0;i<s.size();i++) {
			if((s.get(i).substring(3,5)).equals("22")) {
				batch22.add(s.get(i));
				count++;
			}
		}
		System.out.println("total number of Student in batch 22 is :"+count);
		System.out.println(batch22);
		
	}

}