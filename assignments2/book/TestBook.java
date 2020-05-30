package novice.assignments2.book;

public class TestBook {

	public static void main(String[] args) {
		Author teck = new Author("Tan Ah Teck", "teck@somewhere.com", 'm');
		System.out.println(teck);
		
		Book dummyBook = new Book("Java for dummies", teck, 9.99, 88);
		System.out.println(dummyBook);
		
		Book moreDummyBook = new Book(
					"Java for more dummies",
					new Author("Peter Lee", "peter@nowhere.com", 'm'),
					19.99, 8
				);
		
		System.out.println(moreDummyBook);

	}

}
