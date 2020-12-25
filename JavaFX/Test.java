import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Test extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		// group, scene
		Group root = new Group();
		Scene scene = new Scene( root, 400, 300 );

		// shape
		Circle circle = new Circle( 150, 150, 25 );
		// color
		circle.setFill( Color.RED );

		// add
		root.getChildren().add( circle );

		// set, show
		stage.setScene( scene );
		stage.show();
	}
}