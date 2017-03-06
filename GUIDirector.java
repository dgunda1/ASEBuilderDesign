package MidExam1;


public class GUIDirector {

	private GUIBuilder guiBuilder;
	
	
	public GUIDirector(GUIBuilder guiBuilder){
		
		this.guiBuilder = guiBuilder;
		
	}

	
	public GUI getGUI(){
		
		return this.guiBuilder.getGUI();
		
	}

	
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
