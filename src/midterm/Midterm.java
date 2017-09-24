/* Alex Demers created this program October 26th 2014
the object of the program is to create a facult and student class with different requirements for each constructor
and when fed wrong arguments it catches the exception and outputs an error message
*/

package midterm;

import javax.swing.JOptionPane;

public class Midterm {
    
	public static void main(String[] args) {
		//new CollegeMember("Alex Demers", "ademers145@live.ca");
		//you cannot create objects from an abstract class
		Student myStudent = new Student("Alex Demers", "ademers145@live.ca", "PT", 450.00);
                Faculty myFaculty = new Faculty("Alex Demers", "ademers145@live.ca", 65645.00);
                
		try{//outputs an error message as PP is not a correct student status 
			Student myStudent1 = new Student("Alex Demers", "ademers145@live.ca", "PP", 450.00);
                        System.out.println(myStudent1);
		}
                
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
		try{//outputs an error as PP and email are invalid
			Student myStudent1 = new Student("Alex Demers", "", "PP", 450.00);
                        System.out.println(myStudent1);
		}
                
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
		try{//outputs an error for invalid name                       
			Faculty myFaculty1 = new Faculty(null,"ademers145@live.ca", 50000.00);
                        System.out.println(myFaculty1);
		}
                
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                
		try{//outputs error as salary isn't in valid range
			Faculty myFaculty1 = new Faculty("Alex Demers", "ademers145@live.ca", 40000.00);
                        System.out.println(myFaculty1);
		}
                
		catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                System.out.println(myStudent.greeting());
		System.out.println(myStudent.toString());
                System.out.println(myFaculty.greeting());
		System.out.println(myFaculty.toString());
                
	}
}
