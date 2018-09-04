package capgemini.day4.java;

public class SalesManager extends EmployeeLateral{
	private double petrolAllowance;
	private double foodAllowance;
	private double otherlAllowance;
	public SalesManager() {
		super();
	}
	public SalesManager(String employeeId, String employeeName, double basicSalary) {
		super(employeeId, employeeName, basicSalary);
	}

	@Override
	public double calculateNetSalary()
	{
		petrolAllowance=0.08*basicSalary;
		foodAllowance=0.13*basicSalary;
		otherlAllowance=0.03*basicSalary;
		
		return super.calculateNetSalary()+petrolAllowance+foodAllowance+otherlAllowance;		
	}
	
}  
