
public class MainBookApp {

}

public static void main(String[] args) {
	BookDatabase newBookDB = new BookDatacase();
	
	book newBook = new Book();
	newBook.setAuthor("New Author");
	newBook.setTitle("Book Title");
	newBook.setSku("001");
	newBook.setPrice("5.99");
	newBook.setDescription("This is a book description");
	
	newBookDB.addBook(newBook);
	
	book newBook1 = new Book1();
	newBook.setAuthor("Kathy Sierra and Bert Bates");
	newBook.setTitle("Head First Java");
	newBook.setSku("Java1001");
	newBook.setPrice("47.50");
	newBook.setDescription("Easy to read Java workbook");
	
	newBookDB.addBook(newBook1);
	
	book newBook2 = new Book2();
	newBook.setAuthor("Bruce Eckel");
	newBook.setTitle("Thinking in Java");
	newBook.setSku("Java1002");
	newBook.setPrice("20.00");
	newBook.setDescription("Details about Java under the hood");
	
	newBookDB.addBook(newBook2);
	
	book newBook3 = new Book3();
	newBook.setAuthor("Jeanne Boyarsky");
	newBook.setTitle("OCP: Oracle Certified Professional Java SE");
	newBook.setSku("Orcl1003");
	newBook.setPrice("45.00);
	newBook.setDescription("Everything you need to know in one place");
	
	newBookDB.addBook(newBook3);
	
	book newBook4 = new Book4();
	newBook.setAuthor("Al Sweigart");
	newBook.setTitle("Automate the Boring Stuff with Python");
	newBook.setSku("Python1004");
	newBook.setPrice("10.50");
	newBook.setDescription("Fun with Python");
	
	newBookDB.addBook(newBook4);
	
	book newBook5 = new Book5();
	newBook.setAuthor("Simon Monk");
	newBook.setTitle("The Maker's Guide to the Zombie Apocalypse");
	newBook.setSku("Zombie1005");
	newBook.setPrice("16.50");
	newBook.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
	
	newBookDB.addBook(newBook5);
	
	book newBook6 = new Book6();
	newBook.setAuthor("Donald Norris");
	newBook.setTitle("Raspberry Pi Projects for the Evil Geniu");
	newBook.setSku("Rasp1006");
	newBook.setPrice("14.75");
	newBook.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
	
	newBookDB.addBook(newBook6);
	
	
	
}
	