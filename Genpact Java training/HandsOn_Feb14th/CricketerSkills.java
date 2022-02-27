package Genpact_Day_4;

import java.util.ArrayList;

public class CricketerSkills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cricketer = new ArrayList<String>();
		cricketer.add("Dhoni_Finisher");
		cricketer.add("Kohli_Batsman");
		cricketer.add("Yuvraj_AllRounder");
		cricketer.add("Harbhajan_Bowler");
		cricketer.add("Rahul_Batsman");
		cricketer.add("Rohit_Batsman");
		cricketer.add("Sachin_Batsman");
		cricketer.add("Bumrah_Bowler");
		cricketer.add("Balaji_Bowler");
		cricketer.add("Dravid_Batsman");
		cricketer.add("Ishant_Bowler");
		
		
		System.out.println(cricketer);
		
		int batsman=0,bowler=0,allRounder=0,finisher=0;
		for(String s : cricketer) {
			if(s.contains("Bowler"))
				bowler++;
			else if(s.contains("Batsman"))
				batsman++;
			else if(s.contains("AllRounder"))
				allRounder++;
			else
				finisher++;
			
		}
		System.out.println("No of Batsman : "+batsman);
		System.out.println("No of Bowler : "+bowler);
		System.out.println("No of AllRounder : "+allRounder);
		System.out.println("No of Finisher : "+finisher);
	}

}