package momento;

public class MomentoClient {

	public static void main(String[] args) {
			Emp emp=new Emp();
			emp.setName("Sachin");
			emp.setSalary("200000");
			
			emp.toString();
			CareTaker caretaker=new CareTaker();
			caretaker.set_momento(emp.hyderate());
			
			emp.setName("Saurav");
			emp.setSalary("300000");
			
			emp.toString();
			
			emp.deHyderate(caretaker.get_momento());
			emp.toString();
			
			
	}

}
