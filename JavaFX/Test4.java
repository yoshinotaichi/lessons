import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Test4 extends Application {
	public static void main(String[] args) {
		launch( args );
	}

	@Override
	public void start( Stage stage ) throws Exception {
		Label label = new Label( "hello" );
		CheckBox check = new CheckBox( "チェックボックス" );

		check.setOnAction( (ActionEvent) -> {
			String kekka = check.isSelected() ? "Selected" : "not selected...";
			label.setText( kekka );
		});


		BorderPane pane = new BorderPane();
		pane.setTop( label );
		pane.setCenter( check );

		Scene scene = new Scene( pane, 400, 300 );

		stage.setScene( scene );
		stage.show();
	}
}