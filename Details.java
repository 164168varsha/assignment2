package collectionFramework;

 

public class Details implements Comparable<Details>{
	
	private static final Details args0 = null;

	@Override
	public int compareTo(Details arg0) {
		
		// TODO Auto-generated method stub
		if(this.weight==args0.getWeight()){
			if(this.height==args0.getHeight()){
				return 0;
			}else if(this.weight>args0.getWeight()){
				return 0;
			}else{
				return -1;
			}
		
		}
	return 0;
	}
	

	public String name;
	public int weight;
	public double height; 

	public Details(String name, int weight, double height) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.height=height;
		this.weight=weight;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void display(){
		System.out.println("details of person: name=" +getName()+ "weight=" +getWeight()+ "height=" +getHeight());
	}

	
}
