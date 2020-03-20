// Description : Employee Wage Problem
// Author : Akshay Dhananjay Barve
// Version : 18.04.3 lts
// Since 20th March 2020 / Friday

public class EmployeeWageProblem
{
	public static void main ( String args[] )
	{
     		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
    		int salary=0, empHours=0;
    		final int IS_FULLTIME=1, IS_PARTTIME=2, WAGE_PER_HOUR=20;

    	 	switch (checkNumber)
   	 	{
   	 	case IS_FULLTIME:
   	        	System.out.println("Employee Is Full Time..!");
   	        	empHours=8;
   	        	break;
   	   	case IS_PARTTIME:
  	        	System.out.println("Employee Is Part Time..!");
 	        	empHours=4;
 	        	break;
 	   	default:
 	        	System.out.println("Employee Is Absent..");
 	        	empHours=0;
 	        	break;
 	 	}
      		salary=empHours*WAGE_PER_HOUR;
      		System.out.println("Salary of Employee is.."+salary);
	}
}
