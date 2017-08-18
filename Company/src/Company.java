import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Company {

	ArrayList<Set<Employee>> branches;
	TreeSet<Employee> emploees;
	public Company(ArrayList<Set<Employee>> branches, TreeSet<Employee> emploees) {

		this.branches = new ArrayList<Set<Employee>>();
		this.branches.get(0).add(null);
		this.branches.get(1).add(null);
		this.branches.get(2).add(null);
		this.branches.get(3).add(null);
		this.branches.get(4).add(null);
		this.emploees = new TreeSet<Employee>();
	}
	
	
	
	
}
