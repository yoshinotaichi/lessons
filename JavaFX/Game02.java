import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game02 extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		Group root = new Group();
		Scene scene = new Scene( root, 400, 300 );

		Rectangle rect01 = new Rectangle( 100, 150, 50, 50 );
		Rectangle rect02 = new Rectangle( 150, 150, 50, 50 );

		rect01.setFill( Color.RED );
		rect02.setFill( Color.BLACK );

		root.getChildren().add( rect01 );
		root.getChildren().add( rect02 );

		stage.setScene( scene );
		stage.show();
	}
}
