package collectionFramework;
import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Hash_map4 {
	public static void main(String[] args) {
		
		Map<Date, String> mapobj=new HashMap<Date, String>();
		
		Date d1=new Date(02,11,1999);
		Date d2=new Date(22,12,2000);
		Date d3=new Date(01,10,1999);
		Date d4=new Date(04,11,1999);
		mapobj.put(d1, "abc");
		mapobj.put(d2, "def");
		mapobj.put(d3, "lmn");
		mapobj.put(d4, "xyz");
		
		for(Map.Entry m:mapobj.entrySet()){
			
			System.out.println("DOB=" +m.getKey()+ "name=" +m.getValue());
		}
	
	}
}
