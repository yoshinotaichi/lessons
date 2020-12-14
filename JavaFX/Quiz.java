import java.util.Random;
import java.util.Scanner;

public class Quiz {
 // スキャナをつくる
 static Scanner sc = new Scanner( System.in );
 
 public static void main ( String[] args ) {
   // 最初の画面を表示する
   startGame();

   // メニューを表示する
   printMenu();

   // メニュー入力をもらう
   String userChoice = sc.nextLine();

   // もし play なら、ゲームをはじめる
   if ( "1".equals( userChoice ) ) {
    playGame();
   }
   
   // 最後の画面を表示する
   //endGame();
 }
 
 // いろいろメソッドをつくる
 public static void startGame() {
   System.out.println( "########################" );
   System.out.println( "#    My First Game     #" );
   System.out.println( "#    ver.1             #" );
   System.out.println( "#    by yoshino        #" );
   System.out.println( "########################" );
 }

 // メニューを表示するメソッド
 public static void printMenu() {
   System.out.println( "1: play     2: end" );
   System.out.print( "select: " );
 }

 // ゲームをするメソッド
 public static void playGame() {
   // 質問を表示する
   System.out.println( "田中先生と吉野、どちらが年上でしょうか." );
   
   // 答えをもらう
   System.out.println( "1: 田中先生   2: 吉野   3: 2人は同じ年" );
   System.out.print( "select: " );
   String userChoice = sc.nextLine();
   
   // 正解！とかメッセージを表示する
   if ( "2".equals( userChoice ) ) {
     System.out.println( "正解です！" );
   } else {
     System.out.println( "ちがいます。田中先生と吉野は同じ年です。" );
   }
 }
}