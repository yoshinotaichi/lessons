import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class TestFX2 extends Application {
	Label label;
	TextField field;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		label = new Label("Hello, JavaFX!");
		field = new TextField();
		button = new Button("Click Me!");

		BorderPane pane = new BorderPane();
		pane.setTop( label );
		pane.setCenter( field );
		pane.setBottom( button );

		Scene scene = new Scene( pane, 300, 200 );
		stage.setScene( scene );
		stage.show();
	}
}