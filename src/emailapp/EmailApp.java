package emailapp;

// Scenario: You are an IT Support Administrator Specialist and are
// charged with the task of creating email accounts for new hires.
// Email application should do the following:
// 1. Generate an email with the following syntax: 
//	  firstname.lastname@department.company.com
// 2. Determine the department (sales, development, accounting), 
//	  if none leave blank
// 3. Generate a random String for a password
// 4. Have set methods to change the password, set the mailbox capacity, 
//	  and define an alternate email address
// 5. Have get methods to display the name, email, and mailbox capacity

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Weiquan", "Huang");
		
		em1.displayInfo();
	}

}
