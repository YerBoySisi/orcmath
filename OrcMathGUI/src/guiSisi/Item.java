package guiSisi;

import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class Item extends AnimatedComponent {

	public Item() {
		
		super(31, 27, 207, 229);
		addSequence("resources/spritestrip.png", 75, 31, 27, 207, 229, 6);
		Thread animation = new Thread(this);
		animation.start();
		
	}

	@Override
	public void update(Graphics2D g) {

		super.update(g);

	}

}
