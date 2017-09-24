package midterm;

//cant create a college member because college members are either sutdent or faculty objects
public abstract class CollegeMember {
	
	private String fullName;
	private String email;
	
	public CollegeMember(String fullName, String email){
		
		if(validateFullName(fullName)){//validate name
			this.fullName = fullName;
		}
		else{
			throw new IllegalArgumentException("Invalid name!");
			
		}
		if(validateEmail(email)){//validate 
			this.email = email;
		}
		else{
			throw new IllegalArgumentException("Invalid email, please enter an email address");
		}
	}
	
	public String getFullName(){//returns name
		return fullName;
	}
	
	public String getEmail(){//reutrn email
		return email;
	}
	
	public void setFullName(String fullName){
		if(validateFullName(fullName)){
			this.fullName = fullName;
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public void setEmail(String email){
		if(validateEmail(email)){
			this.email = email;
		}
		else{
			throw new IllegalArgumentException();
		}
	}
	
	public final Boolean validateFullName(String fullName){ //checks name is not null
            return !((fullName == null) || (fullName.isEmpty()));
	}
        
	public final Boolean validateEmail(String email){ //checks email is not null
            return !((email == null) || (email.isEmpty()));
		
	}
	
	abstract public String greeting();
}
		
	

