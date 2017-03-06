package MidExam1;



public class RunGUIBuilder {

	
	public static void main(String[] args){
		
		// Get a RobotBuilder of type OldRobotBuilder
		
		GUIBuilder windosgui = new WindowsGUIBuilder();
		
		// Pass the OldRobotBuilder specification to the engineer
		
		GUIDirector guidirector = new GUIDirector(windosgui);
		
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		
		guidirector.makeGUI();
		
		// The engineer returns the right robot based off of the spec
		// sent to it on line 11
		
		GUI guiObject = guidirector.getGUI();
		
		System.out.println("GUI Built");
		
		System.out.println("GUI Mamin Panel: " + guiObject.getMainPanel());
		System.out.println("GUI Split Panel: " + guiObject.getSplitPanel());
		System.out.println("GUI Button Panel: " + guiObject.getButtonPanel());
		System.out.println("GUI Empty Panel: " + guiObject.getEmptyPanel());
		System.out.println("GUI List Panel: " + guiObject.getListPanel());
		System.out.println("GUI Button: " + guiObject.getButton());
		System.out.println("GUI Button: " + guiObject.getButton());
		System.out.println("GUI Button: " + guiObject.getButton());
		
	}
}
