package testPrep;

public class Contractor implements Employee
{
	private String name;
	private int hRate;
	private int hours;
	
	public Contractor(String name1, int hRate1, int hours1)
	{
		this.name = name1;
		this.hRate = hRate1;
		this.hours = hours1;
	}

	public Employee createNew(String name, int rate, int hours)
	{
		return new Contractor(name, rate, hours);
	}
	public double getPaid()
	{
		return (hRate * hours);
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
