package MidExam1;

public class GUI implements GUILayout {

	private String MainPanel;
	
	private String SplitPanel;
	
	private String ButtonPanel;
	
	private String EmptyPanel;
	
	private String ListPanel;
	
	private String Button_Name;
	
	private String Button_Parent;
	
	
	public String getMainPanel() {
		return MainPanel;
	}
	public void setMainPanel() {
		MainPanel = "Main Panel";
	}
	public String getSplitPanel() {
		return SplitPanel;
	}
	public void setSplitPanel(String splitPanel) {
		SplitPanel = splitPanel;
	}
	public String getButtonPanel() {
		return ButtonPanel;
	}
	public void setButtonPanel(String buttonPanel) {
		ButtonPanel = buttonPanel;
	}
	public String getEmptyPanel() {
		return EmptyPanel;
	}
	public void setEmptyPanel(String emptyPanel) {
		EmptyPanel = emptyPanel;
	}
	public String getListPanel() {
		return ListPanel;
	}
	public void setListPanel(String listPanel) {
		ListPanel = listPanel;
	}
	public String getButton() {
		return Button_Name+""+Button_Parent;
	}
	public void setButton(String button_Name,String button_Parent) {
		Button_Name = button_Name;
		Button_Parent = button_Parent;
	}
	
	
	

}
