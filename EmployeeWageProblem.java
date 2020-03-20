// Description : Employee Wage Problem
// Author : Akshay Dhananjay Barve
// Version : 18.04.3 lts
// Since 19th March 2020 / Thursday

public class EmployeeWageProblem
{
	public static void main ( String args[] )
	{
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int salary=0, empHours=0;
		int IS_FULLTIME=1, IS_PARTTIME=2, WAGE_PER_HOUR=20;
		if ( checkNumber == IS_FULLTIME )
		{
			System.out.println("Employee Is Full Time..!");
			empHours=8;
		}
		else
		if ( checkNumber == IS_PARTTIME )
      {
         System.out.println("Employee Is Part Time..!");
         empHours=4;
      }
		else
		{
			System.out.println("Employee Is Absent..");
			empHours=0;
		}
		salary=empHours*WAGE_PER_HOUR;
		System.out.println("Salary of Employee is.."+salary);
	}
}
