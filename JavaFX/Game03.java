import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Game03 extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		Group root = new Group();
		Scene scene = new Scene( root, 400, 300 );

		Rectangle rect01 = new Rectangle( 100, 100, 50, 50 );
		Rectangle rect02 = new Rectangle( 150, 100, 50, 50 );
		Circle circle = new Circle( 200, 200, 20 );

		rect01.setFill( Color.RED );
		rect02.setFill( Color.BLUE );
		circle.setFill( Color.BLACK );

		root.getChildren().add( rect01 );
		root.getChildren().add( rect02 );
		root.getChildren().add( circle );

		stage.setScene( scene );
		stage.show();
	}
}