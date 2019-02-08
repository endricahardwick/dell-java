import java.util.List;
	
public class Controller {

//	interprets the user input and makes the appropriate changes to the timesheet 
//	based on the actions entered by the user
	

		/* Member variables */
		
	    Timesheet timesheet;
	    ConsoleUtils consoleUtils;
	    
	    /* Constructor */
	    
	    public Controller(){
	        this.timesheet = new Timesheet();
	        this.consoleUtils = new ConsoleUtils();
	    }
	    
	    /* Methods */

		/*
		 * Runs the program
		 */
	    public void start() {

	        consoleUtils.printHelp(); // Print the action menu

	        boolean quit = false;
	        while(!quit) {

				// Prompt the user for input, collect input, parse into parts
	            String input = consoleUtils.promptString("> ");
	            String[] actionParts = input.split(" ");
	            String action = actionParts[0].trim(); // Primary action

				// Figure out what to do depending on the user's primary action
	            if (action.equals("add")) {

	                processAddAction();

	            } else if (action.equals("delete")) {

	                processDeleteAction(actionParts);

	            } else if (action.equals("stop")) {

	                processStopAction(actionParts);

	            } else if (action.equals("list")) {

	                processListAction(actionParts);

	            } else if (action.equals("quit")) {

	                // Your code here
//	            	add code that will cause the while loop to exit and the program to end


	            } else if (action.equals("help")) {

	                // Your code here
	            	consoleUtils.printHelp();

	            } else if(action.length() ==0 ){
	            
	                // do nothing.
	                
	            } else {
	            
	                // Your code here
	                
	            }
	        }

	    }

		/*
		 * The user requested that a given TimesheetEntry be stopped (marked as complete)
		 * This method conveys that request to the Timesheet
		 */
	    public void processStopAction(String[] actionParts){

	        if(actionParts.length > 2){
	            consoleUtils.error("Too many inputs to stop command");
	            return;
	        }

	        int id = Integer.parseInt(actionParts[1]);

			// Your code here
	        timesheet.get();
	        timesheet.stop();
	    }

		/*
		 * The user requested that a given TimesheetEntry be deleted
		 * This method conveys that request to the Timesheet
		 */
	    public void processDeleteAction(String[] actionParts){

	        if(actionParts.length > 2){
	            consoleUtils.error("Too many inputs to delete command");
	            return;
	        }

	        int id = Integer.parseInt(actionParts[1]);
			
			// Your code here
	        timesheet.get();
	        timesheet.delete();
	    }

		/*
		 * The user wants to view a list of timesheet entries
		 * This method conveys that request to the Timesheet,
		 * along with any special options (active-only, filter by project name)
		 */
	    public void processListAction(String[] actionParts){
	    
	        if(actionParts.length > 3){
	            consoleUtils.error("Too many inputs to list command");
	            return;
	        }

			// Your code here
	        
	        timesheet.list();
	        consoleUtils.printList();
	        
//	        Check the actionParts to see if the user entered the -a option
//	        If so, call list() with appropriate value of activeOnly
//	        If not, default to your existing code that prints all entries

//	        Check if the user entered the PROJECT option
//	        If so, retrieve the project name from the user input and pass it to the list() method
//	        If the user entered both the PROJECT option and the -a option, ensure that the list() 
//	        method is called with the appropriate arguments

	    }

		/*
		 * The user wants to add a new entry to the Timesheet
		 * This method conveys that request to the Timesheet, along with
		 * the specified project name and task description 
		 */
	    public void processAddAction(){
	    
	        String project = consoleUtils.promptString("Project Name (one word only):");
	        String description = consoleUtils.promptString("Task:");

			// Your code here
	        add(project, task);
	    }
	}
