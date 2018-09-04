package capgemini.day_4.java;

public class President extends EmployeeLateral {
	private double kmTravelled;
	private static final double telePhoneAllowance=2000;
	public President() {
		super();
	}

	public President(String employeeId, String employeeName, double basicSalary, double kilometerTravelled) {
		super(employeeId, employeeName, basicSalary);
		this.kmTravelled=kilometerTravelled;
	}

	@Override
	public double calculateNetSalary()
	{
		
		return super.calculateNetSalary()+kmTravelled*8+telePhoneAllowance;
	}
	
}
