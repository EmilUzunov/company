import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Company {

	private ArrayList<Set<Employee>> branches;
	
	public Company() {

		this.branches = new ArrayList<Set<Employee>>();
		branches.set(1, new TreeSet());
		
	}
	
	public void addEmployee(int branchNumber, Employee employee){
		this.branches.get(branchNumber).add(employee);
	}
	public void createBranch(String name){
		
	}
	
	
	
}
