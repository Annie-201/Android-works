package Genpact_Day_2;

class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	public String specialization;
	}

	class Qus2{
	  public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "Animesh Rituraj";
	    e.age = 24;
	    e.number = "7667240527";
	    e.address = "Jamshedpur";
	    e.salary = 1008889;
	    e.specialization = "Cpp";

	    Manager m = new Manager();
	    m.name = "Ravi Kumar";
	    m.age = 23;
	    m.number = "9868487338";
	    m.address = "Gurugram";
	    m.salary = 3431089;
	    m.specialization = "Cpp";
	  }
	}	