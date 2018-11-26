package collectionFramework;
import java.util.ArrayList;
import java.util.ListIterator;

public class Array3 {
	public static void main(String[] args) {
		ArrayList<Integer> ad= new ArrayList<Integer>();
		ad.add(0, 10);
		ad.add(1, 20);
		ad.add(2, 30);
		ad.add(3, 40);
		ad.add(4, 50);
		ad.add(5, 60);
		ListIterator<Integer> list1=ad.listIterator(ad.size());
		while(list1.hasPrevious()){
		Integer number=list1.previous();
		System.out.println(number);
		}		
	}
}
