package guiSisi;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.TextArea;
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
	private TextArea text;
	private Button bake;
	private Button save;
	private FileOpenButton load;
	private Button delete;
	private Bakery bakery;
	
	public BakeryScreen(int width, int height) {
		
		super(width, height);
		
	}

	public void initAllObjects(List<Visible> viewObjects) {
		
		bakery = new Bakery();
		
		type = new TextField(20, 100, 200, 30, "" ,"Type");
		
		color = new TextField(20, 150, 200, 30, "" ,"Color");
		
		calories = new TextField(20, 200, 200, 30, "" ,"Calories");
		calories.setInputType(1);
		
		fat = new TextField(20, 250, 200, 30, "" ,"Fat");
		fat.setInputType(1);
		
		sodium = new TextField(20, 300, 200, 30, "" ,"Sodium");
		sodium.setInputType(1);
		
		carbs = new TextField(20, 350, 200, 30, "" ,"Carbohydrates");
		carbs.setInputType(1);
		
		bake = new Button(20, 400, 50, 30, "Bake", new Action() {
			
			public void act() {
				
				bakeBread();
				clearFields();
				bakery.displayBakery();
				
			}
			
		});
		
		save = new Button(70, 400, 50, 30, "Save", new Action() {
			
			public void act() {
				bakery.save();
			}
			
		});
		
		delete = new Button(120, 400, 50, 30, "Delete", new Action() {
			
			public void act() {
				
			}
			
		});
		
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

	
	public void bakeBread() {
		
		try {
			bakery.bakeBread(type.getText(), color.getText(), Integer.parseInt(calories.getText()), Integer.parseInt(fat.getText()), 
							 Integer.parseInt(sodium.getText()), Integer.parseInt(carbs.getText()));
		} catch(NumberFormatException nfe) {
			
		}
		
		
	}
	
	public void clearFields() {
		
		type.setText("");
		color.setText("");
		calories.setText("");
		fat.setText("");
		sodium.setText("");
		carbs.setText("");
		
	}

	@Override
	public void setFile(File f) {

		
		
	}

	@Override
	public JFrame getWindow() {
		
		return null;
		
	}
	
}
