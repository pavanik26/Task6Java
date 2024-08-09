package pack5;

public class Employee {
	
	private String firstname;
	private String lastname;
	private int ID;
	private double sal;
	
	
	
	public String getFirstname() {
		return firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public int getID() {
		return ID;
	}

	
public Employee(String firstname, String lastname, int ID, double sal) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.ID=ID;
	this.sal=sal;
	
}

public void raiseSalary(double percentage) {
    if (percentage < 0) {
        System.out.println("Percentage cannot be negative.");
        return;
    }
    // Calculate the raise amount
    double raiseAmount = sal * (percentage / 100);
    // Update the salary
    sal += raiseAmount;
}


public double getSal() {
	return sal;
}

	public static void main(String[] args) {
		Employee e = new Employee("pavani", "k", 1, 50000.0d);
		System.out.println("Employee salary before revision: " +e.getFirstname() + " "+e.getLastname() +" "+e.getID() +" "+e.getSal());
		e.raiseSalary(10);
		System.out.println("Employee salary after revision: " +e.getFirstname() + " "+e.getLastname() +" "+e.getID() +" "+e.getSal());
				
		
	}
}
