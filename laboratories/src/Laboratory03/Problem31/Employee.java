package Laboratory03.Problem31;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    // instance fields
    private String name;
    private String nickName;
    private double salary;
    private Date hireDay;

    // constructor
    public Employee(String aName, String aNickName,
                    double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        nickName =  aNickName;
        salary = aSalary;
        GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
        hireDay = cal.getTime();
    }
    // instance methods
    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickname(String aNickName) {
        this.nickName = aNickName;
    }

    public double getSalary() {
        return salary;
    }

    // needs to be improved
    public Date getHireDay()  {
        return new Date(hireDay.getTime());
    }

    public void raiseSalary(double percentage) {
        double raise = salary * percentage / 100;
        salary += raise;
    }

    private String format = "name = %s, salary = %.2f, hireDay = %s";

    public String toString() {
        return  String.format(format, name, salary, Util.dateAsString(hireDay));
    }
}

