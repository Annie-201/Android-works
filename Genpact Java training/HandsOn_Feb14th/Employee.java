package Genpact_Day_4;

import java.util.HashSet;
import java.util.Set;

class OldEmployee{
	String name;
	int Id;
	int salary;
	int exp;
	String skill;
	public OldEmployee(String name, int id, int salary, int exp, String skill) {
		super();
		this.name = name;
		Id = id;
		this.salary = salary;
		this.exp = exp;
		this.skill = skill;
	}
}

class NewEmployee{
	String name;
	int Id;
	int salary;
	int exp;
	String skill;
	public NewEmployee(String name, int id, int salary, int exp, String skill) {
		super();
		this.name = name;
		Id = id;
		this.salary = salary;
		this.exp = exp;
		this.skill = skill;
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<OldEmployee> OldSet=new HashSet<OldEmployee>();
		Set<NewEmployee> NewSet=new HashSet<NewEmployee>();
		Set<NewEmployee> mergeSet=new HashSet<NewEmployee>();
		
		OldEmployee o=new OldEmployee("ABC", 101, 30000, 5, "Java trainer");
		OldEmployee o1=new OldEmployee("ACB", 102, 40000, 3, "Cloud trainer");
		OldEmployee o2=new OldEmployee("ABD", 103, 35000, 10, "front-end trainer");
		OldEmployee o3=new OldEmployee("ACD", 104, 30000, 8, "Full stack trainer");
		OldSet.add(o);OldSet.add(o1);OldSet.add(o2);OldSet.add(o3);
		System.out.println(OldSet);
		NewEmployee n=new NewEmployee("XYZ",201,60440,3,"Consultant");
		NewEmployee n1=new NewEmployee("XZY",201,60440,12,"Manager");
		NewEmployee n2=new NewEmployee("ZXY",201,60440,8,"senior Consultant");
		NewEmployee n3=new NewEmployee("ZYX",201,60440,6,"Assistant Consultant");
		NewEmployee n4=new NewEmployee("XUZ",201,60440,15,"Senior manager");
		NewSet.add(n);NewSet.add(n1);NewSet.add(n2);NewSet.add(n3);NewSet.add(n4);
		System.out.println(NewSet);
		
		mergeSet.addAll(NewSet);
		mergeSet.add((NewEmployee) OldSet);
	}

}