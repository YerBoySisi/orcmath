package guiSisi;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Item extends Component {

	public Item() {
		
		super(40, 40, 100, 100);
		
	}

	@Override
	public void update(Graphics2D g) {

		g.setColor(Color.BLACK);
		g.drawRect(0, 0, getWidth(), getHeight());

	}

}
