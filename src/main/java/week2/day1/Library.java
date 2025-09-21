package week2.day1;

public class Library {

	// Method defined with one input argument
	public String addBook(String bookTitle) {

		System.out.println("Book added successfully");
		return bookTitle;

	}

	// Method defined without input argument
	public void issueBook() {

		System.out.println("Book issued successfully");
	}

	// main method
	public static void main(String[] args) {

		// Object Manage created to run methods declared
		Library manageBooks = new Library();

		// addBook is strored to variable printBook
		String printBookName = manageBooks.addBook("Harry Potter");

		System.out.println(printBookName);

		manageBooks.issueBook();

	}

}
