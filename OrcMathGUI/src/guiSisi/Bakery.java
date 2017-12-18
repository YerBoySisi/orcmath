package guiSisi;


import java.util.ArrayList;
import java.util.Scanner;


public class Bakery {
	
	private ArrayList<Bread> breads;
	private static Scanner in = new Scanner(System.in);
	private static Bakery bakery = new Bakery();
	
	public static void main(String[] args) {
		
		String input = prompt();
		
		if(input.equals("bake")) {
			bakery.bakeBread();
		} else if(input.equals("save")) {
			
		} else {
			System.out.println("Invalid input.");
			input = prompt();
		}
		
	}

	public Bakery() {
		
		breads = new ArrayList<Bread>();
		
	}
	
	public static String prompt() {
		
		System.out.println("Type 'bake' to bake a new bread, type 'save' to save your bakery.");
		String input = in.nextLine();
		
		return input;
		
	}
	
	public void bakeBread() {
		
		int count = 0;
		
		Bread brd = new Bread(null, null, 0, 0, 0, 0);
		
		while(count < 6) {
			
			if(count == 0) {
				System.out.println("Type:");
			} else if(count == 1) {
				System.out.println("Color:");
			} else if(count == 2) {
				System.out.println("Calories:");
			} else if(count == 3) {
				System.out.println("Grams of Fat:");
			} else if(count == 4) {
				System.out.println("Grams of Sodium:");
			} else if(count == 5) {
				System.out.println("Grams of Carbohydrates:");
			}
			
			String input= in.nextLine();
			
			if(count == 0) {
				brd.setType(input);
			} else if(count == 1) {
				brd.setColor(input);
			} else if(count == 2) {
				
				try {
					brd.setCalories(Integer.parseInt(input));
				} catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Enter a number");
					input = in.nextLine();
					count--;
				}
				
			} else if(count == 3) {
				
				try {
					brd.setFat(Integer.parseInt(input));
				} catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Enter a number");
					input = in.nextLine();
					count--;
				}
				
			} else if(count == 4) {
				
				try {
					brd.setSodium(Integer.parseInt(input));
				} catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Enter a number");
					input = in.nextLine();
					count--;
				}
				
			} else if(count == 5) {
				
				try {
					brd.setCarbs(Integer.parseInt(input));
				} catch(NumberFormatException nfe) {
					System.out.println("Invalid input. Enter a number");
					input = in.nextLine();
					count--;
				}
				
			}
			
			count++;
			
		}
		
		breads.add(brd);
		
	}
	
	public void displayBakery() {
		
		System.out.println(bakery.getCSVContent());
		
	}
	
	public String getCSVContent() {
		
		String data = "";
		
		for(Bread bread: breads) {
			data += bread + "\n";
		}
		
		return data;
		
	}

}
