package CoreJavaDay50.day35_Encapsulation;

public class C09_Book {

	/*
	    Book class'i verilmistir.
	    iki tane attributes olusturunuz.
	    bookName ve authorName (String ile)
	    Book class'ini kapsulleyin. (Encapsulate)
	    Main class'in icine object  olusturun ve sonucu yazdiriniz.

	"Book name is BOOKNAME and Author is AUTHORNAME"
	 */

	// 1. adim da private leri olusturuyorum...
		private String bookName;
		private	String authorName;
		
	// 2. adimda ise direk source a gidip getters ve
	// setters seceneklerini seciyorum
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		
		
		
	}