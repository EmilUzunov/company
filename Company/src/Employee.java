public class Employee implements Comparable {
	
	private String name;
	private String phone;
	private int salary;
	
	
	
	public Employee(String name, String phone, int salary) {
		super();
		this.setName(name);
		this.setPhone(phone);
		this.setSalary(salary);
	}
	
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		if(name.trim().length()>0&&!(name.equals(null))){
		this.name = name;
		}
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		if(phone.trim().length()>0&&!(phone.equals(null))){
		this.phone = phone;
		}
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>0){
		this.salary = salary;
		}
	}


	


	@Override
	public int compareTo(Object o) {
		return ((Employee)this).getSalary()-((Employee)o).getSalary();
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
	}
	
	
}
