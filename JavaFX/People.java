public class People {
	public static void main(String[] args) {
		Teacher tanaka = new Teacher("田中","元気ですか？", 10);
		Teacher yamamoto = new Teacher("山本","出席たりてますか？", 8);
		Teacher yoshino = new Teacher("吉野","ALOHA!", 5);

		tanaka.hello();
		yamamoto.hello();
		yoshino.hello();

		attack( tanaka, yoshino );
	}

	public static void attack( Teacher a, Teacher b ) {
		System.out.println( a.name + "のこうげき！" );
		System.out.println( b.name + "に５のダメージ！" );
		int damage = 5;

		int newHp = b.hp - damage;

		if ( newHp <= 0 ) {
			System.out.println( b.name + "は死んでしまった！" );
		}
	}
}


class Teacher {
	String msg = "";
	String name = "";
	int hp;

	Teacher( String namae, String kotoba, int value ) {
		name = namae;
		msg = kotoba;
		hp = value;
	}

	public void hello() {
		System.out.println( name + "です。" + msg );
	}
}