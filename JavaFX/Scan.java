import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );

		System.out.print( "input msg >" );
		String msg = sc.nextLine();

		System.out.println( "msg: " + msg );
	}
}