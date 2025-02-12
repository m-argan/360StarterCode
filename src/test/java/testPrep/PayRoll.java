package testPrep;

import java.util.ArrayList;

class PayRoll {
    private ArrayList<Employee> payRoll;

    // Constructor to initialize the list of employees
    public PayRoll() {
        payRoll = new ArrayList<>();
    }

    // Method to add a new employee
    public Employee addEmployee(String name, int rate, int hours, String role) 
    {
        Employee newEmployee = null;
        if(role.equals("Contractor"))
        {
        	newEmployee = new Contractor(name, rate, hours);
        }
        else if(role.equals("Salary"))
        {
        	newEmployee = new SalaryEmployee(name, rate, hours);
        }
        else if(role.equals("Hourly"))
        {
        	newEmployee = new HourlyEmployee(name, rate, hours);
      	}
        payRoll.add(newEmployee);
        return newEmployee;
    }
    

    public double[] payAllEmployees() {
        double[] payArray = new double[payRoll.size()];
        for (int i = 0; i < payRoll.size(); i++) {
            payArray[i] = payRoll.get(i).getPaid();
        }
        return payArray;
    }
}