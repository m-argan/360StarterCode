package testPrep;

public class HourlyEmployee implements Employee
{
	private String name;
	private int hRate;
	private int hours;
	
	public HourlyEmployee(String name1, int hRate1, int hours1)
	{
		this.name = name1;
		this.hRate = hRate1;
		this.hours = hours1;
	}
@Override
	public double getPaid()
	{
		int overtime = hours-40;
		System.out.println("overtime " + overtime);
		double overtimeRate = (hRate * 1.5);
		if(overtime > 0)
		{
			System.out.println("you worked overtime!");
			return ((overtime * overtimeRate)) + (40 * hRate);
			
		}
		else
		{
			return (hours * hRate);
		}
	}

@Override
public void addHours(int hours) 
{
	this.hours += hours;
}

public String getName()
{
return name;
}

public int getRate()
{
return hRate;
}

public int getHours()
{
return hours;
}

}
