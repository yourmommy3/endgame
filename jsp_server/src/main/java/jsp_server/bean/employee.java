package jsp_server.bean;

public class employee {
	private int emp_id; 
	private String emp_name; 
	private double emp_sal; 
	private String emp_email;
	public employee() {
		
	}
	public employee(int emp_id, String emp_name, double emp_sal, String emp_email) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
		this.emp_email = emp_email;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	} 
	
}
