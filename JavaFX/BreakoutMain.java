import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;

public class BreakoutMain extends Application {
  // data
  private BreakoutThread breakoutthread;

  // method
  public static void main(String[] args) {
    launch( args );
  }

  @Override
  public void start( Stage stage ) {
    stage.setTitle( "BreakoutGame" );

    Pane pane = new Pane();
    Scene scene = new Scene( pane );
    stage.setScene( scene );

    Canvas canvas = new Canvas( 640, 480 );
    GraphicsContext gc = canvas.getGraphicsContext2D();
    pane.getChildren().add( canvas );


    // key操作の処理
    scene.setOnKeyPressed(
      new EventHandler<KeyEvent>(){
        public void handle( KeyEvent e ) {
          System.out.println( e.getCode() );
          if( e.getCode() == KeyCode.RIGHT ) {
            System.out.println( "That's RIGHT" );
          }
        }
      }
    );

    breakoutthread = new BreakoutThread( gc );
    breakoutthread.start();

    stage.show();
  }
}



class BreakoutThread extends AnimationTimer {
  // data
  private GraphicsContext gc;
  private Ball ball;
  private Bar bar;

  // method
  public BreakoutThread( GraphicsContext gc ) {
    this.gc = gc;
    this.ball = new Ball();
    this.bar = new Bar();
  }

  @Override
  public void handle( long time ) {
    // clear
    gc.clearRect( 0, 0, 640, 480 );

    // draw
    ball.draw( gc );
    ball.move();

    bar.draw( gc );
  }
}



class Ball {
  // data
  private int x;
  private int y;
  private int x_speed;
  private int y_speed;
  private int size;

  // method
  public Ball() {
    this.x = 0;
    this.y = 0;
    this.x_speed = 5;
    this.y_speed = 5;
    this.size = 20;
  }

  // ballを表示する
  public void draw( GraphicsContext gc ) {
    gc.setFill( Color.RED );
    gc.fillOval( x, y, size, size );
  }

  // ballを移動させる
  public void move() {
    x += x_speed;
    y += y_speed;

    if ( x > 640-size ) {
      x_speed *= -1;
    }
    if ( y > 480-size ) {
      y_speed *= -1;
    }
    if ( x < 0 ) {
      x_speed *= -1;
    }
    if ( y < 0 ) {
      y_speed *= -1;
    }
  }
}



class Bar {
  // data
  private int x;
  private int y;
  private int w;
  private int h;
  private int x_speed;
  private int y_speed;

  // method
  public Bar() {
    this.x = 50;
    this.y = 450;
    this.w = 100;
    this.h = 20;
  }

  public void draw( GraphicsContext gc ) {
    gc.setFill( Color.BLUE );
    gc.fillRect( x, y, w, h );
  }
}