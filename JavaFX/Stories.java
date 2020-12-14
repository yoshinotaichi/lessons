import java.util.Random;
   
public class Stories {
 public static void main ( String[] args ) {
   // randomをつくる
   Random random = new Random();

   // データをつくる
   String[] subjects = { "田中先生が", "山本先生が", "吉野が" };
   String[] places = { "セブンイレブンで", "飛行機の中で", "相鉄線で" };
   String[] done = { "ラーメンを食べた", "風呂にはいった", "料理した" };

   // だれが、どこで、なにした、をつくって表示する
   String story = "";
   int num = random.nextInt(3);
   story = story + subjects[ num ];		// だれが

   num = random.nextInt(3);
   story = story + places[ num ];			// どこで

   num = random.nextInt(3);
   story = story + done[ num ];			// なにした

   System.out.println( story );
 }
}