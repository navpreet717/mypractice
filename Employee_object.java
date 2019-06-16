package practice;

public class Employee_object {
		//properties of employee_object
			private String name;
		private int id;
			private String department;
			private String jobTitle;
			
		//constructor1
			public Employee_object(String n, int id,  String dept, String job) {
				this.name = n;
				this.id = id;
				this.department = dept;
				this.jobTitle = job;
			}
			
			public Employee_object(String n, String job) {
				this.name = n;
				this.jobTitle = job;
				
				this.department = "";
				this.id = 0;
			}
			public Employee_object() {
				this.name = "";
				this.id = 0;
				this.department = "";
				this.jobTitle = "";
			
}
			// GETTER AND SETTER METHODS
				// ---------------------------
			 	
				public String getName() {
					return name;
				}
			
				public int getId() {
					return id;
				}
			
				public String getDepartment() {
					return department;
				}
			
				public String getJobTitle() {
					return jobTitle;
				}
			
				public void setName(String name) {
					this.name = name;
				}
			
				public void setId(int id) {
					this.id = id;
				}
			
				public void setDepartment(String department) {
					this.department = department;
				}
			
				public void setJobTitle(String jobTitle) {
					this.jobTitle = jobTitle;
				
					
			 }
public static void main(String[] args) {
		
		// Make 3 employees
	Employee_object e1 = new Employee_object("John Smith", 9, "IT", "Manager");
	Employee_object e2 = new Employee_object("Peter Karan", 234, "IT", "Engineer");
	Employee_object e3 = new Employee_object("Laura Yao", 1555, "Accounting", "Finance Specialist");
	
//Output the name and department to the screen
	// -----------------------
		// Employee 1
		System.out.println(e1.getName());
	System.out.println(e1.getDepartment());
		System.out.println("------");
		// Employee 2
		System.out.println(e2.getName());
		System.out.println(e2.getDepartment());
		System.out.println("------");
		
		// Employee 3
		System.out.println(e3.getName());
		System.out.println(e3.getDepartment());
		System.out.println("------");
		
}}

