import java.util.Scanner;
import java.util.Random;

 public class game2{
 	public static void main(String[] args) {
			System.out.println("いつか恋人がいて知りたい！");
			System.out.println("1：男性ーーー2：女性");
			System.out.println("選んでください");
			
			Random rd = new Random();
			Scanner sc = new Scanner(System.in);
			String a[] ={"あした！","	いつまでも！！！","I LOVE YOU"};
			int b = sc.nextInt();

 		// ↓　こう書いたら、すこし短くなります
 		int c = rd.nextInt( 3 );	// c: 0, 1, 2
 		System.out.println( a[c] );		// message 1個表示できる
 	}
 }