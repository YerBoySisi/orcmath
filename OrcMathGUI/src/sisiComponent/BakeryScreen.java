package sisiComponent;

import java.util.List;

import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class BakeryScreen extends FullFunctionScreen {
	
	private static final long serialVersionUID = -2452328323352199392L;
	
	private TextField type;
	private TextField color;
	private TextField calories;
	private TextField fat;
	private TextField sodium;
	private TextField carbs;
	
	public BakeryScreen(int width, int height) {
		
		super(width, height);
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		
		type = new TextField(20, 100, 200, 30, "..." ,"Type");
		color = new TextField(20, 150, 200, 30, "..." ,"Color");
		calories = new TextField(20, 200, 200, 30, "..." ,"Calories");
		fat = new TextField(20, 100, 250, 30, "..." ,"Fat");
		sodium = new TextField(20, 300, 200, 30, "..." ,"Sodium");
		carbs = new TextField(20, 350, 200, 30, "..." ,"Carbohydrates");
		
		viewObjects.add(type);
		viewObjects.add(color);
		viewObjects.add(calories);
		viewObjects.add(fat);
		viewObjects.add(sodium);
		viewObjects.add(carbs);
		
	}

	
	public void n() {
		
	}
	
}
