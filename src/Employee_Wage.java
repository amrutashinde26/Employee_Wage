
    public class Employee_Wage {
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage.");
            int FULL_TIME_EMP = 1;
            int PART_TIME_EMP=2;
            int EMP_RATE_PER_HOUR = 20;
            int EMP_FULL_TIME_HOUR = 8;
            int EMP_PART_TIME_HOUR=4;
            int EMP_WORK_DAYS = 20;
            int EMP_WORK_HOUR = 100;
            int total_wage = 0;
            double daily_emp_wage =0;
            int total_emp_work_hour = 0;
            int total_emp_work_day = 0;


            while(total_emp_work_hour<= EMP_WORK_HOUR && total_emp_work_day < EMP_WORK_DAYS ){
                total_emp_work_day++;
                int empcheck = (int) Math.floor(Math.random() * 10 % 3);

                if (empcheck == FULL_TIME_EMP) {
                    System.out.println("Employee are present for full time.");
                    daily_emp_wage = EMP_FULL_TIME_HOUR * EMP_RATE_PER_HOUR;
                    total_emp_work_hour += EMP_FULL_TIME_HOUR;
                }
                else if (empcheck == PART_TIME_EMP) {
                    System.out.println("Employee are present for part time.");
                    daily_emp_wage = EMP_PART_TIME_HOUR * EMP_RATE_PER_HOUR;
                    total_emp_work_hour += EMP_PART_TIME_HOUR;
                }
                else {
                    System.out.println("Employee are not present");
                    daily_emp_wage = 0;
                    total_emp_work_hour += 0;
                }
                total_wage += daily_emp_wage;

                System.out.println("Employee Daily Wage is : " + daily_emp_wage);
            }
            System.out.println("The Wages for a month is :" +total_wage);
            System.out.println("Total wages of working hours 100 and max days 20 is for month : "+total_wage);
        }
    }
}
