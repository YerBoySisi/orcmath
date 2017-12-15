package guiSisi;

import java.awt.Color;
import java.util.ArrayList;

public class Bakery {
	
	private ArrayList<Bread> breads;
	
	public static void main(String[] args) {
		
		Bakery bakery = new Bakery();
		
		System.out.println(bakery.getCSVContent());
		
	}
	
	public Bakery() {
		
		breads = new ArrayList<Bread>();
		
		breads.add(new Bread("White", Color.WHITE, 300, 0, 17, 30));
		breads.add(new Bread("Burnt", Color.BLACK, 217, 1, 20, 7));
		breads.add(new Bread("Bleu", Color.BLUE, 250, 20, 7, 13));
		
	}
	
	public String getCSVContent() {
		
		String data = "";
		
		for(Bread bread: breads) {
			data += bread + "\n";
		}
		
		return data;
		
	}

}
