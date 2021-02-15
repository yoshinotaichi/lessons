import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;

public class KeyTestFX extends Application {
	BreakoutThread breakoutthread;

	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) {
		stage.setTitle( "Key Test" );

		Key key = new Key();

		Pane pane = new Pane();
		Scene scene = new Scene( pane );
		stage.setScene( scene );

		scene.setOnKeyPressed(
			new EventHandler<KeyEvent>() {
				public void handle( KeyEvent e ) {
					key.keyPressed( e );
				}
			}
		);

		stage.show();
	}
}



class Key {
	// data

	// method
	public void keyPressed( KeyEvent e ) {
		switch( e.getCode() ) {
			case LEFT:
				System.out.println( "LEFT pressed." );
				break;
			case RIGHT:
				System.out.println( "RIGHT pressed." );
				break;
			default:
				break;
		}
	}
}