package com.employee.service.model;

public class Employee {
	
	private Integer employeeId;
	private String fname;
	private String lname;
	private String organisation;
	private double salary;
	private String city;
	private String mobileNUmber;
	
	public Employee() {
	}
	
	public Employee(Integer employeeId, String fname, String lname, String organisation, double salary, String city,
			String mobileNUmber) {
		super();
		this.employeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
		this.organisation = organisation;
		this.salary = salary;
		this.city = city;
		this.mobileNUmber = mobileNUmber;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNUmber() {
		return mobileNUmber;
	}
	public void setMobileNUmber(String mobileNUmber) {
		this.mobileNUmber = mobileNUmber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + ", organisation="
				+ organisation + ", salary=" + salary + ", city=" + city + ", mobileNUmber=" + mobileNUmber + "]";
	}
}
