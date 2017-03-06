package MidExam1;



public class RunGUIBuilder {

	
	public static void main(String[] args){
		
		GUIBuilder windosgui = new WindowsGUIBuilder();
		
		
		GUIDirector guidirector = new GUIDirector(windosgui);
		
		
		guidirector.makeGUI();
		
		
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
