import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Company {

	private ArrayList<Set<Employee>> branches;
	private TreeSet<Employee> emploees;
	
	public Company() {

		this.branches = new ArrayList<Set<Employee>>();
		this.emploees = new TreeSet<Employee>();
		this.branches.get(0).addAll(emploees);
		this.branches.set(0, null);
//		this.branches.get(1).add(null);
//		this.branches.get(2).add(null);
//		this.branches.get(3).add(null);
//		this.branches.get(4).add(null);
		
	}
	
	public void addEmployee(int branchNumber, Employee employee){
		this.branches.get(branchNumber).add(employee);
	}
	public void createBranch(String name){
		
	}
	
	
	
}
