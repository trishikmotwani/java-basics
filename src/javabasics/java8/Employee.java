package javabasics.java8;

public class Employee {

	static String empName = "Trishik";
	static Integer empId = 1;
	static final String TESTFINAL = null;
	
	public static String getEmpName() {
		return empName;
	}
	public static void setEmpName(String empName) {
		Employee.empName = empName;
	}
	public static Integer getEmpId() {
		return empId;
		
	}
	public static void setEmpId(Integer empId) {
		Employee.empId = empId;
	}
	
	
	
}
