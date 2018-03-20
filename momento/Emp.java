package momento;

public class Emp {
String name;

public void setName(String name) {
	this.name = name;
}
String salary;

public void setSalary(String salary) {
	this.salary = salary;
}
@Override
	public String toString() {
		System.out.println("Name="+name);
		System.out.println("Salary "+salary);
		System.out.println("__________________________");
		return "";
	}

	public Momento hyderate()
	{
		return new Momento(name, salary);
	}
	public void deHyderate(Momento momento)
	{
		this.name=momento.getEmpName();
		this.salary=momento.getEmpSalary();
	}

}
