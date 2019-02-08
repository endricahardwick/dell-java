import java.time.LocalDateTime;

public class TimesheetEntry {

//	Represents an entry in the time sheet.
	
//	Member variables:
		private String projectName;
		private String task;
		private int id;
		private LocalDateTime startTime;
		private LocalDateTime endTime;
		
//		Note: You will have to import java.time.LocalDateTime for the startTime and endTime variables
//		Static variable
		private static int NEXTID = 1;
		
//		Constructor empty
		public TimesheetEntry() {
		}
		
		
//		Constructor Initialized
		public TimesheetEntry(String myProject, String myTask) {
			this.projectName = myProject;
			this.task = myTask;
			this.startTime = LocalDateTime.now();
			this.id = NEXTID;
			NEXTID++;
		}

//		getter & setters
		
		public String getProjectName() {
			return projectName;
		}


		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}


		public String getTask() {
			return task;
		}


		public void setTask(String task) {
			this.task = task;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public LocalDateTime getStartTime() {
			return startTime;
		}


		public void setStartTime(LocalDateTime startTime) {
			this.startTime = startTime;
		}


		public LocalDateTime getEndTime() {
			return endTime;
		}


		public void setEndTime(LocalDateTime endTime) {
			this.endTime = endTime;
		}


		public static int getNEXTID() {
			return NEXTID;
		}


		public static void setNEXTID(int nEXTID) {
			NEXTID = nEXTID;
		}


//		Methods:
		public void updateEndTime() {
//		If endTime has not been set, set it to LocalDateTime.now()
			endTime = LocalDateTime.now();
//		Otherwise, do nothing (for now)
			
			
//		throw an exception if the value of endTime has already been set
//		Modify the code that calls updateEndTime() to catch the exception 
//		and return a friendly message to the user
		}

	
}
