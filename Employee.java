package collectionFramework;

public class Employee {
		String name;
		int id;
		float salary;

		public Employee(String name, int id, int salary) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + Float.floatToIntBits(salary);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Float.floatToIntBits(salary) != Float
					.floatToIntBits(other.salary))
				return false;
			return true;
		}
		
		
}
