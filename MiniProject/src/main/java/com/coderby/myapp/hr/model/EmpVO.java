package com.coderby.myapp.hr.model;

public class EmpVO {

	
	private int menuId;
	private int storeId;
	private String menuName;
	private int menuCost;
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuCost() {
		return menuCost;
	}
	public void setMenuCost(int menuCost) {
		this.menuCost = menuCost;
	}
	@Override
	public String toString() {
		return "EmpVO [menuId=" + menuId + ", storeId=" + storeId + ", menuName=" + menuName + ", menuCost=" + menuCost
				+ "]";
	}
	
	
//	private int employeeId;
//	private String firstName;
//	private String lastName;
//	private String email;
//	private String phoneNumber;
//	private Date hireDate;
//	private String jobId;
//	private double salary;
//	private double commissionPct;
//	private int managerId;
//	private int departmentId;
//	
//	public int getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	public Date getHireDate() {
//		return hireDate;
//	}
//	public void setHireDate(Date hireDate) {
//		this.hireDate = hireDate;
//	}
//	public String getJobId() {
//		return jobId;
//	}
//	public void setJobId(String jobId) {
//		this.jobId = jobId;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	public double getCommissionPct() {
//		return commissionPct;
//	}
//	public void setCommissionPct(double commissionPct) {
//		this.commissionPct = commissionPct;
//	}
//	public int getManagerId() {
//		return managerId;
//	}
//	public void setManagerId(int managerId) {
//		this.managerId = managerId;
//	}
//	public int getDepartmentId() {
//		return departmentId;
//	}
//	public void setDepartmentId(int departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	@Override
//	public String toString() {
//		return "EmpVO [employeeId=" + employeeId + ", firstName=" + firstName
//				+ ", lastName=" + lastName + ", email=" + email
//				+ ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate
//				+ ", jobId=" + jobId + ", salary=" + salary
//				+ ", commissionPct=" + commissionPct + ", managerId="
//				+ managerId + ", departmentId=" + departmentId + "]";
//	}
	
}