package helloWorld;

public class Person
{

	String fname;
	String lname;
	int age;
	
	
	public Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}


	@Override
	public String toString()
	{
		return fname + " " + lname +  " " + age;
	}


	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return fname;
	}

	public Person makePerson(Person that) throws UnderAgeException
	{
		if(this.age < 18 || that.age < 18)
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.getFname(), that.getLname(), 0);
		return child;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lname;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}


	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public static void main (String[] Person)
	{
		Person r = new Person ("Romeo", "Mon", 15);
		System.out.println("R " + r);
	}
}
