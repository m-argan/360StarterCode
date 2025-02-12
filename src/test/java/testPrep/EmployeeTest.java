package testPrep;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{

	Contractor A;
	SalaryEmployee B;
	HourlyEmployee C;
	private PayRoll payRoll;
	
	@BeforeEach
	void setUp() throws Exception
	{
		payRoll = new PayRoll();

	}

	@Test
	void test()
	{
		Employee A = payRoll.addEmployee("John", 10, 0, "Contractor");
		Employee B = payRoll.addEmployee("Ann", 10, 10, "Salary");
		Employee C = payRoll.addEmployee("Jim", 10, 45, "Hourly");
		
		//check adding wages works
		assertEquals(A.getHours(), 0);
		A.addHours(3);
		assertEquals(A.getHours(), 3);
		A.addHours(0);
		assertEquals(A.getHours(), 3);
		
		//check proper wage calculation for contractor
		assertEquals(A.getPaid(),30);
		
		//check proper wage calculation for hourly employee with overtime
		assertEquals(C.getPaid(), 475);
		
		//check proper wage calculation for salary employee
		assertEquals(B.getPaid(), 400);

		
		double[] pay = payRoll.payAllEmployees();
		
		//double pay = payRoll.getPaid();
		//int[]pay = payDay(payRoll);
		assertEquals(pay[0], 30);
		assertEquals(pay[1], 400);
		assertEquals(pay[2], 475);
		
		
	}

}
