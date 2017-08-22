import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Company {

	private ArrayList<Set<Employee>> branches;
	
	public Company() {

		this.branches = new ArrayList<Set<Employee>>(20);
		TreeSet<Employee> elements = new TreeSet<Employee>();
		for (int i = 0; i < 10; i++) {
			branches.add(i, elements);
		}
//		Employee ivan = new Employee("Ivan","0881234456",900);
//		elements.add(ivan);
		branches.set(0, elements);
		
		
	}
	
	public void addEmployee(int branchNumber, Employee employee){
		this.branches.get(branchNumber).add(employee);
	}
	public void createBranch(String name){
		
	}

	@Override
	public String toString() {
		return "Company [branches=" + branches + "]";
	}
	
	
	
}
