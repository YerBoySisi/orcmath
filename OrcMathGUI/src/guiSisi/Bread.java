package guiSisi;


import java.awt.Graphics2D;
import guiTeacher.components.Component;


public class Bread extends Component {
	
	String type;
	String color;
	int calories;
	int fat;
	int sodium;
	int carbs;
	
	public Bread(String type, String color, int calories, int fat, int sodium, int carbs) {
		
		super(0, 0, 30, 30);
		
		this.type = type;
		this.color = color;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbs = carbs;
		
	}
	
	public String toString() {
		
		return type + "," + color + " color," + calories + " calories," + fat + "g of fat," + sodium + "g of sodium," + carbs + "g of carbohydrates";
		
	}

	@Override
	public void update(Graphics2D g) {

		
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

}
