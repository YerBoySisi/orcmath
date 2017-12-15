package guiSisi;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Bread extends Component {
	
	String type;
	Color color;
	int calories;
	int fat;
	int sodium;
	int carbs;
	
	public Bread(String type, Color color, int calories, int fat, int sodium, int carbs) {
		
		super(0, 0, 30, 30);
		
		this.type = type;
		this.color = color;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbs = carbs;
		
	}
	
	public String toString() {
		
		return type + ", " + color + ", " + calories + ", " + fat + ", " + sodium + ", " + carbs;
		
	}

	@Override
	public void update(Graphics2D g) {

		
		
	}

}
