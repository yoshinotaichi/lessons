import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GameTmp extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		Group root = new Group();
		Scene scene = new Scene( root, 400, 300 );

		int circleX = 0;
		int circleY = 100;
		int radius = 20;
		Circle[] circles = new Circle[10];
		for ( int i=0; i<10; i++ ) {
			circles[i] = new Circle( circleX, circleY, radius );
			radius += 5;
			circleX += radius*2;

			circles[i].setFill( Color.BLUE );

			root.getChildren().add( circles[i] );
		}

		stage.setScene( scene );
		stage.show();
	}
}