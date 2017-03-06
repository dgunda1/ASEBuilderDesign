package MidExam1;
 
public interface GUIBuilder {

	public void ConstructMainPanel();
	
	public void ConstructSplitPanel(String parent);
	
	public void ConstructButtonPanel(String parent);
	
	public void ConstructEmptyPanel(String parent);
	
	public void ConstructListPanel(String parent);
	
	public void ConstructButton(String name,String parent);
	
	public GUI getGUI();
}

