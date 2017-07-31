/**
 * 
 */

package book;

/**
 * @author GraphicStarr
 /**
  * This application will contain a method to return a book object.
  * This application will also create a list of books from said database and look
  * up books, according to its SKU, title and author and display all contents, including
  * the description and the price.
  */
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookData {
	
	
	public static void main(String[] arg){ 
	
		// TODO Auto-generated method stub
		
		
		Object String = "";
		Scanner scanner = new Scanner(System.in);
		String skuNum = "";
		String bookTitle = "";
		String descript = "";
		double price = 0.0;
		String author = "";
		
	// Create a book list by storing to an Array list
		
		ArrayList<newBook> = new ArrayList<newBook>();
		
		BookDatabase newBookDB = new BookDatacase();
		
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
		newBook.setTitle("Raspberry Pi Projects for the Evil Genius");
		newBook.setSku("Rasp1006");
		newBook.setPrice("14.75");
		newBook.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		
		newBookDB.addBook(newBook6);
			
	
	
// Prompt the user to enter the SKU of book
			
	do{	
		System.out.println("Does the user know the SKU of the book? Y/N");
		skuNum = scanner.nextLine();
		
		if(answer.equalsIgnoreCase("y")){
		System.out.println("Enter the SKU of the book");
   
// Prompt the user to enter the title of book
		
		}else{
			System.out.println("Does the user know the title of the book? Y/N");
		}
		
		if(answer.equalsIgnoreCase("y")){
			System.out.println("Enter the title of book");
			bookTitle = scanner.nextLine();
			
// Prompt the user to enter the title or the author of book
			
		}else{
			System.out.println("Does the user know the title or author of book Y/N");
			author = scanner.nextLine();
			
		}if (answer.equalsIgnoreCase("y")){
			 
			System.out.println("Enter the author of book");
			author = scanner.nextLine();
			
		}else if{
			System.out.prinln("Enter the title of book");
			bookTitle = scanner.nextLine();
		}
		else{
			System.out.println("Does the user want to look up another book Y/N");
			answer = scanner.nextLine();
		}
// Prompt the user to look up another book
			
		
		
	while(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"));


	}if (answer.equalsIgnoreCase("y")){
	System.out.println("");
	
	}else
	System.out.println("Enjoy your books and Have a nice day!");
	
		

	}	


	}
}		