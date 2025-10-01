package Basics;

public class Library{
	public static void main(String[] args) {
		Author a = new Author("William","US");
		Book b = new Book("Harry Poter",123,a);
		System.out.println(b);
	}
}