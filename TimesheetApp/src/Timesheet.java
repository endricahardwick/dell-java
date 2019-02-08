import java.util.List;
import java.util.ArrayList;

public class Timesheet {

//	This is the “database” that stores the time sheet entries.
	
//	Member variable:
		private List<TimesheetEntry> database;
		
//		Note: You will have to import java.util.List and java.util.ArrayList
		
		
//		Constructor Initialized
		public Timesheet() {
			database = new ArrayList<>();
		}

//		gets & sets
		public List<TimesheetEntry> getDatabase() {
			return database;
		}

		public void setDatabase(List<TimesheetEntry> database) {
			this.database = database;
		}
		
//		Methods
		
//		Method creates a new TimesheetEntry and adds it to the Timesheet database
		
		public void add(String project, String task) {
			
			processAddAction();
			database.add(project,task);
		}
		
//		Method list() that returns a List<TimesheetEntry> of the entries in the database

		public void list(String name) {
			boolean activeOnly;
			
//			If activeOnly is set to true, 
//			return a list of all the active (incomplete) TimesheetEntries in the Timesheet
//			Otherwise, return a list of all the entries in the timesheet
			
//			If the name argument is not null, return a list of TimesheetEntries whose projectName field matches name
//			Otherwise, return a list of all the entries in the timesheet
			
			Integrate this functionality with the -a option, 
//			so that list PROJECT -a returns all active entries with the specified project name


			
			return database.List<TimesheetEntry>;
		}
		
		public void get(int id) {
			
//			Searches the database for a TimesheetEntry with the specified id
//			If a TimesheetEntry is found, return it
//			Otherwise, return null
			
			if() {
				
			}else
				return null;
		}
		
		public void delete(TimesheetEntry entry) {
			
			database.remove(entry);
		}
		
		public void stop(TimesheetEntry entry) {
			updateEndTime();
		}
}
