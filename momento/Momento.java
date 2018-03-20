package momento;

public class Momento {
	String empName;

	public String getEmpName() {
		return empName;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	String empSalary;

	public Momento(String empName, String empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}
}
