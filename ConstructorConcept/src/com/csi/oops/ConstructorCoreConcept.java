package com.csi.oops;
class Employee{
	int empId = 121;
	String empName = "SWARA";
	double empSalary = 35000.50;
	String empAddress;
	long empContactNumber;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println(" \n Employee Id:" + empId + " \n Employee Name: " + empName + " \n Employee salary:"+ empSalary);
	}
	public Employee ( String empAddress,long empContactNumber, String  empEmailId){
		System.out.println("\n Employee Address:" + empAddress + "\n Employee Contact number:"+ empContactNumber + "\n Employee Email Id: " + empEmailId);
		this.empAddress = empAddress;
		this.empContactNumber = empContactNumber;
	}
	public void displayData (){
		System.out.println("\n Employee Address:" + empAddress + "\n EmployeeContactNumber:"+ empContactNumber) ;
	}
}
public class ConstructorCoreConcept {
public static void main(String[] args) {
Employee e1 = new Employee ();
Employee e2 = new Employee ("MUMBAI INDIA" , 56254524545L,   "BINU@CSI.COM");
e2.displayData();
}
}
//ADDED BY GANESH