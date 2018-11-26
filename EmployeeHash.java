package collectionFramework;

import java.util.Hashtable;

public class EmployeeHash {

	public static void main(String[] args) {
		Hashtable<Employee, Integer> emp=new Hashtable<Employee, Integer>();
		Employee e1=new Employee("varsha",1,20000);
		Employee e2=new Employee("varsha", 1, 20000);
		Employee e3=new Employee("mayuri", 3, 400);
		emp.put(e1, 1);
		emp.put(e2, 1);
		emp.put(e3, 3);
		//emp.put(e4, 4);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(0));
		System.out.println(e3.equals(0));
		System.out.println(e1.hashCode());
		//System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}

}
