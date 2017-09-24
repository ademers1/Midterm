package midterm;

public class Faculty extends CollegeMember{
	private String fullName;
	private String email;
	private double salary;
	private final double minSalary = 50000.00;
	
	public Faculty(String fullName, String email, double salary){
		super(fullName, email);
		if(super.validateFullName(fullName)){
			this.fullName = fullName;
		}
		else{
			throw new NullPointerException("Invalid name, please enter your full name.");
		}
		if(super.validateEmail(email)){
			this.email = email;			
		}
		else{
			throw new IllegalArgumentException("Invalid email, please enter an email address");
		}
		if(validateSalary(salary)){
			this.salary = salary;
		}
		else{
			throw new IllegalArgumentException("Invalid Salaray, please enter 50000.00 or greater!");
		}
	}
	
    public final boolean validateSalary(double salary){
            return salary >= minSalary;//validate salary is above min range
	}
	

    @Override
	public String greeting(){
		String greeting = "Hello, I am an instructor and my email is ";
		greeting += email;
		return greeting;
	}
	
        @Override
	public String toString(){//faculty information 
		String toStr;
		toStr = "Fullname:";
		toStr += this.fullName;
		toStr += "\nEmail:";
		toStr += this.email;
		toStr += "\nSalary:";
		toStr += this.salary;
		return toStr;
	}
}
