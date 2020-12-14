import java.util.Scanner;

public class ArrayTest {
	public static void main ( String[] args ) {
		Scanner sc = new Scanner( System.in );

		String password = "asb";

		while ( true ) {
			System.out.print( "input password: " );

			String userData = sc.nextLine();

			if ( password.equals( userData ) ) {
				break;
			}
		}
	}
}

