package MidExam1;

public class MacGUIBuilder implements GUIBuilder {

private GUI macgui;
	
	public MacGUIBuilder() {
		
		this.macgui = new GUI();
		
	}

	public void ConstructMainPanel() {
		// TODO Auto-generated method stub
		this.macgui.setMainPanel();
	}

	public void ConstructSplitPanel(String parent) {
		// TODO Auto-generated method stub
		this.macgui.setSplitPanel(parent);
	}

	public void ConstructButtonPanel(String parent) {
		// TODO Auto-generated method stub
		this.macgui.setButtonPanel(parent);
	}

	public void ConstructEmptyPanel(String parent) {
		// TODO Auto-generated method stub
		this.macgui.setEmptyPanel(parent);
	}

	public void ConstructListPanel(String parent) {
		// TODO Auto-generated method stub
		this.macgui.setListPanel(parent);
	}

	public void ConstructButton(String name, String parent) {
		// TODO Auto-generated method stub
		this.macgui.setButton(name, parent);
	}

	public GUI getGUI() {
		// TODO Auto-generated method stub
		return this.macgui;
	}
}
