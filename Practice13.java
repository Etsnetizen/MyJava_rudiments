class Book
{
	private String Book_name;
	public Book(String name){
		this.Book_name = name;
	}
	protected void finalize(){
		System.out.println("Book:" + Book_name + "is destroyed");
	}
}

public class Practice13 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("Roma Holiday");
		new Book("learn java");
		/*new Book("think in java");
		b1 = new Book("study java");*/
		System.gc();//´òÓ¡³öBook:learn javais destroyed
	}
}
