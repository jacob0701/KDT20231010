package toString;

public class Book {

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return "Book{" + 
//				"title='" + title + '\'' + 
//				", author='" + author + '\'' +
//				'}';
//	}

	public static void main(String[] args) {

		Book book = new Book("우리 반 모두 멋있는 개발자", "from 선생님");
		System.out.println(book);
		
	}

}
