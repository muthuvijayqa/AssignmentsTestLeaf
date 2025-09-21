package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {

		// Object created for Class Library
		Library handleLibrary = new Library();

		// Calling Methods of Library
		String printBookName = handleLibrary.addBook("Vikings");
		System.out.println(printBookName);
		handleLibrary.issueBook();

	}

}
