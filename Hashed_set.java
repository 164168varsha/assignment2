package collectionFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashed_set {
	public void hashdemo(){
		HashSet<Integer> ad= new HashSet<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		Iterator<Integer> list1=ad.iterator();
		while(list1.hasNext()){
		System.out.println(list1.next());
		}
		}
	public void linkHashdemo(){
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		Hashed_set set=new Hashed_set();
		
		System.out.println("hashSet Demo=");
		set.hashdemo();
		System.out.println("linkhashSet demo=");
		set.linkHashdemo();
		
	
	}
}

