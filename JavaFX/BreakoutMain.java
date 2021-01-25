import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;

public class BreakoutMain extends Application {
  // data
  private BreakoutThread breakoutthread;

  // method
  public static void main(String[] args) {
    launch( args );
  }

  @Override
  public void start( Stage stage ) {
    // title, pane, scene, setScene()
    stage.setTitle( "BREAKOUT" );
    Pane pane = new Pane();
    Scene scene = new Scene( pane );
    stage.setScene( scene );

    // canvas, graphicscontext, add()
    Canvas canvas = new Canvas( 640, 480 );
    GraphicsContext gc = canvas.getGraphicsContext2D();
    pane.getChildren().add( canvas );

    // thread, start()
    breakoutthread = new BreakoutThread(gc);
    breakoutthread.start();

    // show
    stage.show();
  }
}



class BreakoutThread extends AnimationTimer {
  // data
  private GraphicsContext gc;

  // ボールのデータ
  private int ball_x;
  private int ball_y;
  private int x_speed;
  private int y_speed;

  // method
  BreakoutThread( GraphicsContext gc ) {
    this.gc = gc;

    ball_x = 0;
    ball_y = 0;
    x_speed = 5;
    y_speed = 5;
  }

  @Override
  public void handle( long time ) {
    gc.clearRect( 0, 0, 640, 480 );

    gc.setFill( Color.BLACK );
    gc.fillOval( ball_x - 5,  ball_y - 5,  10, 10 );

    if ( ball_x >= 640 || ball_x < 0 ) {
      x_speed = x_speed * -1;
    }

    if ( ball_y >= 480 || ball_y < 0 ) {
      y_speed = y_speed * -1;
    }

    ball_x += x_speed;
    ball_y += y_speed;
  }
}