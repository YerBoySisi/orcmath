package guiSisi;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class BakeryScreen extends FullFunctionScreen implements FileRequester {
	
	private static final long serialVersionUID = -2452328323352199392L;
	
	private TextField type;
	private TextField color;
	private TextField calories;
	private TextField fat;
	private TextField sodium;
	private TextField carbs;
	private Button bake;
	private Button save;
	private FileOpenButton load;
	private Button delete;
	
	public BakeryScreen(int width, int height) {
		
		super(width, height);
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		
		type = new TextField(20, 100, 200, 30, "" ,"Type");
		color = new TextField(20, 150, 200, 30, "" ,"Color");
		calories = new TextField(20, 200, 200, 30, "" ,"Calories");
		fat = new TextField(20, 250, 200, 30, "" ,"Fat");
		sodium = new TextField(20, 300, 200, 30, "" ,"Sodium");
		carbs = new TextField(20, 350, 200, 30, "" ,"Carbohydrates");
		
		bake = new Button(20, 400, 50, 30, "Bake", null);
		save = new Button(70, 400, 50, 30, "Save", null);
		delete = new Button(120, 400, 50, 30, "Delete", null);
		load = new FileOpenButton(170, 400, 50, 30, null, this);
		
		viewObjects.add(type);
		viewObjects.add(color);
		viewObjects.add(calories);
		viewObjects.add(fat);
		viewObjects.add(sodium);
		viewObjects.add(carbs);
		
		viewObjects.add(bake);
		viewObjects.add(save);
		viewObjects.add(delete);
		viewObjects.add(load);
		
	}

	
	public void n() {
		
		
		
	}

	@Override
	public void setFile(File f) {

		
		
	}

	@Override
	public JFrame getWindow() {
		
		return null;
		
	}
	
}
