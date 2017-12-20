package guiSisi;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Bakery {
	
	private ArrayList<Bread> breads;
	
	public Bakery() {
		
		breads = new ArrayList<Bread>();
		
	}
	
	public void bakeBread(String typ, String clr, int cal, int fat, int sdm, int crb) {
		
		breads.add(new Bread(typ, clr, cal, fat, sdm, crb));
		
	}
	
	public void displayBakery() {
		
		System.out.println(getCSVContent());
		
	}
	
	public String getCSVContent() {
		
		String data = "";
		
		for(Bread bread: breads) {
			data += bread + "\n";
		}
		
		return data;
		
	}

	public void save() {
		
		try {
			
			FileWriter writer = new FileWriter("resources/BakeryMenu.csv");
			
			for(Bread bread: breads) {
				writer.write(bread.toString() + "\n");
			}
			
			writer.close();
			
			System.out.println("File successfully saved.");
			
		} catch(IOException io) {
			System.out.println("The directory you wish to save the file in does not exist. Save failed.");
		}
		
	}

}
