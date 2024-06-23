
public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage.");
        int FULL_TIME_EMP = 1;
        int PART_TIME_EMP=2;
        int EMP_RATE_PER_HOUR = 20;
        int EMP_FULL_TIME_HOUR = 8;
        int EMP_PART_TIME_HOUR=4;
        double daily_emp_wage =0;


        double empcheck = Math.floor(Math.random()*10%3);

        if(empcheck == FULL_TIME_EMP){
            System.out.println("Employee are present for full time.");
            daily_emp_wage = EMP_FULL_TIME_HOUR * EMP_RATE_PER_HOUR;
        }
        else if (empcheck == PART_TIME_EMP) {
            System.out.println("Employee are present for part time.");
            daily_emp_wage = EMP_PART_TIME_HOUR * EMP_RATE_PER_HOUR;
        }
        else{
            System.out.println("Employee are not present");
            daily_emp_wage=0;
        }

        System.out.println("Employee Daily Wage is : " + daily_emp_wage);


    }
}
