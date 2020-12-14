import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		// タイトル表示
		System.out.println( "##########" );
		System.out.println( "##      ##" );
		System.out.println( "## YT's ##" );
		System.out.println( "##      ##" );
		System.out.println( "##########" );
		System.out.println( "" );
		System.out.println( "1: play    2: end" );

		// menu 入力 & 次の画面表示
		System.out.print( "> " );
		Scanner sc = new Scanner( System.in );
		int userInput = sc.nextInt();

		// 1だったら、、、　２だったら、、、
		if ( userInput == 1 ) {
			System.out.println( "Let's play!" );
		} else {
			System.out.println( "##########" );
			System.out.println( "##      ##" );
			System.out.println( "## Game ##" );
			System.out.println( "## Over ##" );
			System.out.println( "##      ##" );
			System.out.println( "##########" );
		}
	}
}