import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
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
		View v = new View();
		Scene scene = new Scene( v, 500, 400 );
		stage.setScene( scene );
		stage.show();
	}
}




class View extends Group {
	public View() {
		// shape, color
		Circle circle = new Circle( 0, 0, 30 );
		circle.setFill( Color.BLUE );

		// animation
		TranslateTransition animation = new TranslateTransition( Duration.seconds(2), circle );
		// from, to
		animation.setFromX(250);
		animation.setFromY(400);
		animation.setToX(250);
		animation.setToY(0);
		// setCycleCount
		animation.setCycleCount( Animation.INDEFINITE );

		// play, add
		animation.play();
		getChildren().add( circle );
	}
}