import javafx.animation.Animation;
// import javafx.animation.TranslateTransition;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		View v = new View();
		Scene scene = new Scene( v, 500, 400 );
		stage.setScene( scene );
		stage.show();
	}
}


class View extends Group {
	public View() {
		// shape, color
		Polygon triangle = new Polygon( 100, 20, 130, 230, 250, 130 );
		triangle.setFill( Color.CYAN );

		// animation, fromto, setcyclecount, setautoreverse
		// TranslateTransition animation = new TranslateTransition( Duration.seconds( 2 ), triangle );
		// animation.setFromX( 0 );
		// animation.setFromY( 50 );
		// animation.setToX( 500 );
		// animation.setToY( 400 );
		ScaleTransition animation = new ScaleTransition( Duration.seconds(2), triangle );
		animation.setFromX( 0.1 );
		animation.setFromY( 0.1 );
		animation.setToX( 3 );
		animation.setToY( 3 );
		animation.setCycleCount( Animation.INDEFINITE );
		animation.setAutoReverse( true );

		// play, add
		animation.play();
		getChildren().add( triangle );
	}
}