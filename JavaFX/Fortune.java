import java.util.Random;
 public class Fortune {
   public static void main ( String[] args ) {
     // fortuneデータをつくる
     String[] fortune = { "luckey", "usual", "unluckey" };

     // randomをつくる;  0, 1, 2 をつくれるか？テストしましょう
     Random random = new Random();

     int num = random.nextInt( 3 );
     System.out.println( fortune[ num ] );
   }
 }