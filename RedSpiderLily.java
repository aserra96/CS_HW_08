package hw08;
//IGNORE THIS, it was an attempt
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class RedSpiderLily extends Pane {
	public void HiginbanaPane() {
		this.createBackground();
	}
	private void createBackground() {
		//background
	    Rectangle sky = new Rectangle(0, 0, 600, 400);
	    sky.setStroke(Color.DEEPSKYBLUE);
	    sky.setFill(Color.DEEPSKYBLUE);
	    
	    Rectangle ground = new Rectangle(0, 400, 600, 400);
	    ground.setStroke(Color.BROWN);
	    ground.setFill(Color.rgb(34,139,34));
	    
	    int sunangle = 10;
	    for(int i=0;i<8;i++){
	    	Ellipse ellipse = new Ellipse(0, 0, 200, 30);
	    	ellipse.setFill(Color.YELLOW);
	    	ellipse.setRotate(sunangle);
	    	sunangle +=30;
	    	super.getChildren().add(ellipse);
	    }
	super.getChildren().addAll(sky, ground);
	}
}
