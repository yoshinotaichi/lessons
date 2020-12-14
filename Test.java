import javafx.animation.TranslateTransition;
import javafx.animation.Animation;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;


public class Test extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage primaryStage ) throws Exception {
		View v = new View();
		Scene scene = new Scene( v, 400, 300 );

		primaryStage.setScene( scene );
		primaryStage.show();
	}
}


class View extends Group {
	public View() {
		Rectangle rect = new Rectangle( 0, 0, 50, 50 );
		rect.setFill( Color.RED );
		Rectangle rect2 = new Rectangle( 0, 0, 50, 50 );
		rect2.setFill( Color.BLUE );
		Circle circle = new Circle( 0, 0, 50 );
		circle.setFill( Color.GREEN );

		// rect
		TranslateTransition animation = new TranslateTransition( Duration.seconds(1), rect );

		animation.setFromX( 0 );
		animation.setFromY( 0 );
		animation.setToX( 350 );
		animation.setToY( 250 );

		animation.setCycleCount( Animation.INDEFINITE );
		animation.setAutoReverse( true );
		// animation.setAutoReverse( false );
		animation.play();
		getChildren().add( rect );

		// rect2
		TranslateTransition animation2 = new TranslateTransition( Duration.seconds(2), rect2 );

		animation2.setFromX( 200 );
		animation2.setFromY( 300 );
		animation2.setToX( 200 );
		animation2.setToY( 0 );

		animation2.setCycleCount( Animation.INDEFINITE );
		animation2.setAutoReverse( true );
		// animation.setAutoReverse( false );
		animation2.play();
		getChildren().add( rect2 );

		// circle
		TranslateTransition animation3 = new TranslateTransition( Duration.seconds(2), circle );

		animation3.setFromX( 100 );
		animation3.setFromY( 300 );
		animation3.setToX( 200 );
		animation3.setToY( 0 );

		animation3.setCycleCount( Animation.INDEFINITE );
		animation3.setAutoReverse( true );
		// animation.setAutoReverse( false );
		animation3.play();
		getChildren().add( circle );
	}
}