
public class Demo {

	public static void main(String[] args) {

		Company myCompany = new Company();
		
		Employee ivan = new Employee("Ivan","0881234456",900);
		Employee stefan = new Employee("Stefan","0881564456",950);
		Employee krisi = new Employee("Krisi","0881238956",800);
		Employee sara = new Employee("Sara","0881239876",980);
		Employee marta = new Employee("Marta","0881238765",1000);
		Employee dani = new Employee("Dani","0881212356",700);
		Employee pedro = new Employee("Pedro","0881246556",925);
		Employee hose = new Employee("hose","0881235956",800);
		Employee metodi = new Employee("Metodi","0881239616",998);
		
		myCompany.addEmployee(0, ivan);
		myCompany.addEmployee(0, stefan);
		myCompany.addEmployee(0, krisi);
		myCompany.addEmployee(0, sara);
		myCompany.addEmployee(0, marta);
		myCompany.addEmployee(0, dani);
		myCompany.addEmployee(0, pedro);
		myCompany.addEmployee(0, hose);
		myCompany.addEmployee(0, metodi);
		
	}

}
