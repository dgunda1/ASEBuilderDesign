package MidExam1;


public class GUIDirector {

	private GUIBuilder guiBuilder;
	
	// gui specification is sent to the engineer
	
	public GUIDirector(GUIBuilder guiBuilder){
		
		this.guiBuilder = guiBuilder;
		
	}
	
	// Return the Robot made from the OldRobotBuilder spec
	
	public GUI getGUI(){
		
		return this.guiBuilder.getGUI();
		
	}
	
	// Execute the methods specific to the RobotBuilder 
	// that implements RobotBuilder (OldRobotBuilder)
	
	public void makeGUI() {
		
		this.guiBuilder.ConstructMainPanel();
		this.guiBuilder.ConstructSplitPanel("MainPanel");
		this.guiBuilder.ConstructButtonPanel("MainPanel");
		this.guiBuilder.ConstructEmptyPanel("SplitPanel");
		this.guiBuilder.ConstructListPanel("SplitPanel");
		this.guiBuilder.ConstructButton("B1", "ButtonPanel");
		this.guiBuilder.ConstructButton("B2", "ButtonPanel");
		this.guiBuilder.ConstructButton("B3", "ButtonPanel");
		
	}
}
