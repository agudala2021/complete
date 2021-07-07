package com.example.restservice;

public class Emp_Details {

    private String firstName;
    private String lastName;
    private String emp_no;
    private String HomeAddress;
    private String company;
    private String state;
    private String skill;
    private int Salary;
    private String vaccine_status;

    public Emp_Details(String firstName, String lastName, String emp_no, String HomeAddress, String company, String state, String skill, int Salary, String vaccine_status){
        this.firstName= firstName;
        this.lastName= lastName;
        this.emp_no = emp_no;
        this.HomeAddress = HomeAddress;
        this.company = company;
        this.state = state;
        this.skill = skill;
        this.Salary = Salary;
        this.vaccine_status = vaccine_status;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmp_no() {
        return emp_no;
    }
    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }
    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getState() {
        return state;
    }
    public void setState(String State) {
        this.state = state;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String Company) {
        this.company = company;
    }

    public int getSalary() {return Salary;    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getVaccine_status() {
        return vaccine_status;
    }
    public void setVaccine_status(String vaccine_status) {
        this.vaccine_status = vaccine_status;
    }
}
