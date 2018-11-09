package exercise1;

public class WorkHourSalaryEmployee extends Employee{
	private int hourRate;

	@Override
	public int computeSalary()
	{
		return hourRate*workedHours;
	}

	public WorkHourSalaryEmployee(String a, int b)
	{
		super(a);
		hourRate=b;
	}



}
