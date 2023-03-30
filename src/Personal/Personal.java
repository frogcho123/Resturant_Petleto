package Personal;

import java.math.BigDecimal;

public class Personal {//abstract
    private String name;
    private String jobDescription;
    private BigDecimal salary;

    public Personal(String name , String jobDescription , BigDecimal salary) {
        this.name = name;
        this.jobDescription = jobDescription;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
