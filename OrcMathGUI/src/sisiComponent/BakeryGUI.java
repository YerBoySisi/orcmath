package sisiComponent;

import guiTeacher.GUIApplication;


public class BakeryGUI extends GUIApplication {

	private static final long serialVersionUID = -2452328323352199392L;

	public BakeryGUI(int width, int height) {
		
		super(width, height);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		
		BakeryGUI sample = new BakeryGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
		
	}

	@Override
	public void initScreen() {
		
		BakeryScreen bs = new BakeryScreen(getWidth(), getHeight());
		setScreen(bs);
		
	}
	
}
