package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity = 1000;
    private String alterEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "company.com";
    
    // constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        
        // call a method asking for the department - return the department
        this.department = setDepartment();
        // System.out.println("DEPARTMENT: " + this.department);
        
        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("PASSWORD: " + this.password);
        
        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" 
        + department.toLowerCase() + "." + companySuffix;
        // System.out.println("YOUR EMAIL ADDRESS: " + email);
    }
    
    // ask for the department
    private String setDepartment() {
    	System.out.print("New Employee: " + firstName + " " + lastName
    			+ "\nDEPARTMENT CODE BELOW: "
    			+ "\nSales: 1 \nDevelopment: 2 \nAccounting: 3"
    			+ "\nENTER DEPARTMENT: ");
        Scanner input = new Scanner(System.in);
    	int choice = input.nextInt();
    	if (choice == 1) {
    		return "Sales";
    	} else if (choice == 2) {
    		return "Development";
    	} else if (choice == 3) {
    		return "Accounting";
    	} else {
    		return "";
    	}
    }
    
    // generate a random password
    private String randomPassword(int length) {
    	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    			+ "abcdefghijklmnopurstuvwxyz!@#$%^&*()0123456789";
    	char[] password = new char[length];
    	for (int i = 0; i < length; i++) {
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    	}
    	return new String(password);
    }
    
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity = capacity;
    }
    
    // get the mailbox capacity
    public int getMailboxCapacity() {
    	return mailboxCapacity;
    }
    
    // set the alternate email
    public void setAlterEmail(String alterEmail) {
    	this.alterEmail = alterEmail;
    }
    
    // get the alternate email
    public String getAlterEmail() {
    	return alterEmail;
    }
    
    // set/change the password
    public void changePassword(String password) {
    	this.password = password;
    }
    
    // get the password
    public String getPassword() {
    	return password;
    }
    
    public void displayInfo() {
    	System.out.println("FULL NAME: " + firstName + " " + lastName +
    			"\nCOMPANY EMAIL: " + email + 
    			"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB");
    }
}
