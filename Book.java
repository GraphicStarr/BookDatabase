/**
 * 
 */
package book;

/**
 * @author student
 *
 */
public class Book {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private String skuNum;
		private String bookTitle;
		private String descript;
		private String author;
		private double price;
	}
	
	public BookData(){
		
	public BookData(String skuNum, string bookTitle, string descript, string author, double price){
		
	public BookData(String skuNum){
		
		this.skuNum = skuNum;
		this.bookTitle = bookTitle;
		this.descript = description;
		this.author = author;
		this.price = price;
		
	}
	
	public String getskuNum() {
		return skuNum;
	}
	public void setskuNum (String skuNum){
		this.skuNum = skuNum;
	}
	public String getbookTitle() {
		return bookTitle;
	}
	public void setbookTitle (String bookTitle){	
		this.bookTitle = bookTitle;
	}
	public String getdescript() {
		return getdescript;
	}
	public void setdescript (String descript){
		this.descript = descript;
	}			
	public String getauthor() {
		return author;
	}
    public void setauthor (String author){			
		this.author = author;
    }			
    public double getprice() {
		return price;
	}
	public void setprice(double price){				
		this.price = price;
}
		
	public BookData returnBookObject(String skuNum){
		BookData book = new BookData(skuNum);
		return book;
}
