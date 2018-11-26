package collectionFramework;
import java.util.Set;
import java.util.TreeSet;

public class Person {
		
		
	public static void main(String[] args) {
		Set<Details> set=new TreeSet<Details>();
			Details d1=new Details("abc", 40, 5.0);
			Details d2=new Details("xyz", 40, 5.2);
			Details d3=new Details("lmn", 45, 5.4);
			Details d4=new Details("def", 41, 4.9);
			set.add(d1);
			set.add(d2);
			set.add(d3);
			set.add(d4);
			for(Details d:set){
				d.display();
			}
		

	}

}
