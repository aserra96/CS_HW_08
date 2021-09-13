package hw08;
/* Angel Serrano
 * CS 2012
 * Section 05
 * Description: This is main body and where the code is places to create a Red Spider Lily or 
 * Higinbana 
 */
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Main extends Application {
	public static void main(String[] args) {
		Application.launch();
	}
	
	@Override
	public void start(Stage primaryStage) {
		//creates pane
		Pane root = new Pane();
		
		//background - this section of code creates the background for the Flower
	    Rectangle sky = new Rectangle(0, 0, 600, 400);
	    sky.setStroke(Color.DEEPSKYBLUE);
	    sky.setFill(Color.DEEPSKYBLUE);
	    root.getChildren().add(sky);
	    
	    Rectangle ground = new Rectangle(0, 400, 600, 400);
	    ground.setStroke(Color.BROWN);
	    ground.setFill(Color.rgb(34,139,34));
	    root.getChildren().add(ground);
	    
	    int sunangle = 10;
	    for(int i=0;i<8;i++){
	    	Ellipse ellipse = new Ellipse(0, 0, 200, 30);
	    	ellipse.setFill(Color.YELLOW);
	    	ellipse.setRotate(sunangle);
	    	root.getChildren().add(ellipse);  
	    	sunangle +=30;
	    }
		//Root this creates the Root of the Red Spider Lily as the root is known to be long
	    //in real life 
	    Rectangle spiderRoot = new Rectangle(280, 300, 15, 300);
	    spiderRoot.setStroke(Color.rgb(0,100,0));
	    spiderRoot.setFill(Color.rgb(0,100,0));
	    root.getChildren().add(spiderRoot);
	    
	    //Stem this creates the stems of the flower leading to where the Umbels and Stamens of 
	    //the lower life
	    //Stem1
	    Rectangle spiderStem = new Rectangle(280, 290, 13, 60);
	    spiderStem.setStroke(Color.rgb(0,100,0));
	    spiderStem.setFill(Color.rgb(0,100,0));
	    //Rotate-rotates the first stem
	    Rotate rotate = new Rotate();
	    rotate.setAngle(40);
	    rotate.setPivotX(350);  
	    rotate.setPivotY(328);  
	    //
	    spiderStem.getTransforms().add(rotate);
	    root.getChildren().add(spiderStem);
	    
	    //Stem2
	    Rectangle spiderStem2 = new Rectangle(280, 290, 13, 70);
	    spiderStem2.setStroke(Color.rgb(0,100,0));
	    spiderStem2.setFill(Color.rgb(0,100,0));
	    //Rotate-rotates the second stem
	    Rotate rotate1 = new Rotate();
	    rotate1.setAngle(300);
	    rotate1.setPivotX(240);  
	    rotate1.setPivotY(330);  
	    //
	    spiderStem2.getTransforms().add(rotate1);
	    root.getChildren().add(spiderStem2);
	    
	    //This section of creates the Umbels of the Flower or petals of the flower which are 
	    //rotating ellipses
	    //Umbels1
	    int angle = 35;
	    for(int i=0;i<4;i++){
	    	Ellipse ellipse = new Ellipse(240, 275, 7.3, 70);
	    	ellipse.setFill(Color.FIREBRICK);
	    	ellipse.setRotate(angle);
	    	root.getChildren().add(ellipse);  
	    	angle += 70;
	    }
	    //Umberls2
	    int angle1 = 35;
	    for(int i=0;i<4;i++){
	    	Ellipse ellipse = new Ellipse(320, 270, 7, 60);
	    	ellipse.setFill(Color.FIREBRICK);
	    	ellipse.setRotate(angle1);
	    	root.getChildren().add(ellipse);  
	    	angle1 += 70;
	    }
	    //This section creates the Stamens which are the the spider leg like feature of 
	    //the Higinbana and this class creates random lengths of the arc to create 5 Stamesn
	    //for each bulb
	    //Stamens 1
	    for (int i = 0; i < 5; i++) {
	    	int radX = (int)(Math.random() * ((120 - 70) + 70));
	    	Arc arc = new Arc(215, 205, radX, 70, -80, -90);
	    	arc.setFill(Color.TRANSPARENT);
	    	arc.setStroke(Color.RED);
	    	arc.setType(ArcType.OPEN);
	    	root.getChildren().add(arc);
	    }
	    //Stamens 2
	    for (int i = 0; i < 5; i++) {
	    	int radX = (int)(Math.random() * ((120 - 70) + 70));
	    	Arc arc = new Arc(318, 193, radX, 70, -80, 90);
	    	arc.setFill(Color.TRANSPARENT);
	    	arc.setStroke(Color.RED);
	    	arc.setType(ArcType.OPEN);
	    	root.getChildren().add(arc);
	    }
	    //creates Scene
		Scene scene = new Scene(root, 600, 600); 
		primaryStage.setTitle("Red Spider Lily");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}
