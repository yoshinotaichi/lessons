import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

// Movingクラスをつくる
public class Moving extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		View v = new View();
		Scene scene = new Scene( v, 400, 300 );
		stage.setScene( scene );
		stage.show();
		// key
		scene.setOnKeyPressed( e->System.out.println( e.getCode() + "キーがおされました") );
	}
}


class View extends Group {
	public View() {
		// shape, setFill
		Rectangle rect = new Rectangle( 0, 0, 60, 70 );
		rect.setFill( Color.GREEN );
		Rectangle rect2 = new Rectangle( 230, 30, 80, 80 );
		rect2.setFill( Color.BLACK );

		// animation
		TranslateTransition animation = new TranslateTransition( Duration.seconds(2), rect );
		// from, to
		animation.setFromX( -50 );
		animation.setFromY( 50 );
		animation.setToX( 300 );
		animation.setToY( 50 );

		// cyclecount
		animation.setCycleCount( Animation.INDEFINITE );

		// play, add
		animation.play();
		getChildren().add( rect );
		getChildren().add( rect2 );

	}
}