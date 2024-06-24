
public class Employee_Wage {

    int FULL_TIME_EMP = 1;
    int PART_TIME_EMP = 2;
    int EMP_FULLTIME_WORK_HOUR = 8;
    int EMP_PARTTIME_WORK_HOUR = 4;


    public int calculateEmployeeWage(String company, int EMP_RATE_PER_HOUR, int EMP_WORK_DAYS, int EMP_WORK_HOUR) {

        int emp_wage = 0;
        int total_wage = 0;
        int total_emp_work_hour = 0;
        int total_emp_work_day = 0;

        while (total_emp_work_hour <= EMP_WORK_HOUR && total_emp_work_day < EMP_WORK_DAYS) {

            total_emp_work_day++;
            int emp_check = (int) Math.floor(Math.random() * 10 % 3);

            if (emp_check == FULL_TIME_EMP) {
                emp_wage = EMP_RATE_PER_HOUR * EMP_FULLTIME_WORK_HOUR;
                total_emp_work_hour += EMP_FULLTIME_WORK_HOUR;
            } else if (emp_check == PART_TIME_EMP) {
                emp_wage = EMP_RATE_PER_HOUR * EMP_PARTTIME_WORK_HOUR;
                total_emp_work_hour += EMP_PARTTIME_WORK_HOUR;
            } else {
                emp_wage = 0;
                total_emp_work_hour += 0;
            }
            total_wage += emp_wage;
        }
        System.out.println("Total wages of Company is : ");
        return total_wage;
    }

    public static void main(String[] args) {

        Employee_Wage emp1 = new Employee_Wage();
        System.out.println(emp1.calculateEmployeeWage("Nokia", 400, 25, 150));

        Employee_Wage emp2 = new Employee_Wage();
        System.out.println(emp2.calculateEmployeeWage("Apple", 600, 27, 162));
    }

}
