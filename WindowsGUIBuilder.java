package MidExam1;
 

public class WindowsGUIBuilder implements GUIBuilder {
	
	private GUI windoesgui;
	
	public WindowsGUIBuilder() {
		
		this.windoesgui = new GUI();
		
	}

	public void ConstructMainPanel() {
		// TODO Auto-generated method stub
		this.windoesgui.setMainPanel();
	}

	public void ConstructSplitPanel(String parent) {
		// TODO Auto-generated method stub
		this.windoesgui.setSplitPanel(parent);
	}

	public void ConstructButtonPanel(String parent) {
		// TODO Auto-generated method stub
		this.windoesgui.setButtonPanel(parent);
	}

	public void ConstructEmptyPanel(String parent) {
		// TODO Auto-generated method stub
		this.windoesgui.setEmptyPanel(parent);
	}

	public void ConstructListPanel(String parent) {
		// TODO Auto-generated method stub
		this.windoesgui.setListPanel(parent);
	}

	public void ConstructButton(String name, String parent) {
		// TODO Auto-generated method stub
		this.windoesgui.setButton(name, parent);
	}

	public GUI getGUI() {
		// TODO Auto-generated method stub
		return this.windoesgui;
	}

}
