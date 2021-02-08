public class Test3 {
	public static void main(String[] args) {
		Person p = new Person( "Yoshino", "Kisarazu", 46, true );
		p.sayHello();
	}
}

// class Person;
class Person {
	// data
	private String name;
	private String address;
	private int age;
	private boolean likesMovie;
	private int num;

	// method;  constructor & sayHello()
	public Person( String name, String address, int age, boolean likesMovie ) {
		int num = 0;

		setName( name );
		setAddress( address );
		setAge( age );
		setLikesMovie( likesMovie );

		if ( num == 1 ){
			System.exit(1);
		}
    }

 	public void sayHello(){
	  String person = "My name is "+name+"."+"I am "+age+" years old."+"I live in "+address+". And, I ";
	  if ( this.likesMovie ) {
	  	person += "love movies!";
	  } else {
	  	person += "don't like movies.";
	  }
	  System.out.println( person);
	}

	public void setName( String data ) {
		if ( data.length() >= 5 ) {
			this.name = data;
		} else {
			this.num = 1;
			handleError( "name" );
		}
	}

	public void setAddress( String data ) {
		if ( data.length() >= 4 ) {
			this.address = data;
		} else {
			this.num = 1;
			handleError( "address" );
		}
	}

	public void setAge( int data ) {
		if ( data >= 15 ) {
			this.age = data;
		} else {
			this.num = 1;
			handleError( "age" );
		}
	}

	public void setLikesMovie( boolean flag ) {
		this.likesMovie = flag;
	}

	public void handleError( String fieldName ) {
		System.out.println( fieldName + "のデータに問題があります。" );
		System.exit( 1 );
	}
} // class の終わり
