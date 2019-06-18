package practice;

public class Employee {
	private String name;
	private int id;
	private String department;
	private String jobTitle;
	//constructor
	public Employee(String name,int id,String department,String jobTitle) {
		this.name=name;
		this.id=id;
		this.department=department;
		this.jobTitle=jobTitle;
	}
	public  Employee(String name,String jobTitle) {
		this.name=name;
		this.id=0;
		this.department="";
		this.jobTitle=jobTitle;
	}
	
	public  Employee() {
		this.name="";
		this.id=0;
		this.department="";
		this.jobTitle="";
	}
	public void setname(String name) {
		this.name= name;
	}
	public void setid(int id) {
	this.id=id;
	}
	public void setdepartment(String department) {
		 this.department=department;
	}
	public void setjobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
	public String getname() {
		return name;
	}
	public int getid() {
		return id;
	}
	public String getdepartment() {
		return department;
	}
	public String getjobTitle() {
		return jobTitle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("John Smith", 9, "IT", "Manager");
			Employee e2 = new Employee("Peter Karan", 234, "IT", "Engineer");
				Employee e3 = new Employee("Laura Yao", 1555, "Accounting", "Finance Specialist");
		
				// Employee 1
					System.out.println(e1.getname());
						System.out.println(e1.getdepartment());
						System.out.println("------");
						// Employee 2
						System.out.println(e2.getname());
						System.out.println(e2.getdepartment());
						System.out.println("------");
						
						// Employee 3
						System.out.println(e3.getname());
						System.out.println(e3.getdepartment());
						System.out.println("------");
						
				 	}
	
}
