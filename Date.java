package collectionFramework;

import java.util.Comparator;


public class Date implements Comparator<Date>{
	private int dd;
	private int mm;
	private int yyyy;
	public Date(Date date) {
		// TODO Auto-generated constructor stub
		
	}

	public Date(int dd,int mm,int yyyy) {
		// TODO Auto-generated constructor stub
	super();
	this.dd=dd;
	this.mm=mm;
	this.yyyy=yyyy;
	
	}

	

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return dd;
	}

	public void setYyyy(int yyyy) {
		this.dd = yyyy;
	}

	public int compareTo(Date arg0) {
		// TODO Auto-generated method stub
		if(this.dd==arg0.getDd() && this.mm==arg0.getMm()){
		return 0;
		}else
		return 1;
	}

	@Override
	public int compare(Date arg0, Date arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	//public void show(){
	//System.out.println("DOB=" +getKey()+ "name=" +m.getValue());
	//}
	
	
	
}
