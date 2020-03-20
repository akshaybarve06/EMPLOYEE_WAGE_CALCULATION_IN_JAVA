// Description : Employee Wage Problem
// Author : Akshay Dhananjay Barve
// Version : 18.04.3 lts
// Since 20th March 2020 / Friday

public class EmployeeWageProblem
{
   public static void main ( String args[] )
    {
      final int IS_FULLTIME=1, IS_PARTTIME=2, MAX_DAYS=20, WAGE_PER_HOUR=20, MAX_HOURS=100;
      int totalSalary=0, totalEmpHours=0, noOfDays=0;
      while ( totalEmpHours < MAX_HOURS && noOfDays < MAX_DAYS )
      {
        int checkNumber=(int)(Math.floor(Math.random()*10)%3);
        noOfDays+=1;
        int salary=0, empHours=0;
        switch (checkNumber)
        {
        case IS_FULLTIME:
            empHours=8;
            break;
        case IS_PARTTIME:
            empHours=4;
            break;
        default:
            empHours=0;
            break;
        }
        salary=empHours*WAGE_PER_HOUR;
        totalEmpHours+=empHours;
        totalSalary+=salary;
        System.out.println("Salary of Employee on "+noOfDays+ "th Day is.."+salary);
      }
      System.out.println("ToTal Salary of Employee is.."+ totalSalary);
   }
}
