package midterm;

public class Student extends CollegeMember{

	private String fullName;
	private String email;
	private String status;
	private Double fees;
	private final String PT = "PT", FT = "Ft";
	private final int minFees = 400, maxFees = 800;
	
	public Student(String fullName,String email, String status, Double fees){
		super(fullName, email);
		if(super.validateFullName(fullName)){
			this.fullName = fullName;
		}
		else{
			throw new IllegalArgumentException("Invalid name, please enter your full name!");
		}
		if(super.validateEmail(email)){
			this.email = email;			
		}
		else{
			throw new IllegalArgumentException("Invalid email, please enter an email address!");
		}
		if(validateStatus(status)){
			this.status = status;
		}
		else{
			throw new IllegalArgumentException("Invalid status, please enter FT or PT!");
		}
		if(validateFees(fees)){
			this.fees = fees;
		}
		else{
			throw new IllegalArgumentException("Invalid fees, please enter between 400-800!");
		}
		
	}
	
	public final boolean validateStatus(String status){//validates status
            return status.equalsIgnoreCase(PT) || (status.equalsIgnoreCase(FT));
	}
	
	public final boolean validateFees(double fees){
            return fees >= minFees && fees <= maxFees; //make sure fees in in correct range
	}
	
        @Override
	public String greeting(){//student greeting
		String greeting = "Hello, I am a student and my name is ";
		greeting += fullName;
		return greeting;
	}

        @Override//student information
	public String toString(){
		String toStr;
		toStr = "Fullname:";
		toStr += this.fullName;
		toStr += "\nEmail:";
		toStr += this.email;
		toStr += "\nStatus:";
		toStr += this.status;
		toStr += "\nFees:";
		toStr += this.fees;
		return toStr;
				
	}
}
