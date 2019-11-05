class Book
{
	String Book_name;//实例变量，存在堆中
	private static int count;//类变量，存在静态数据区中
	public Book(String name){
		this.Book_name = name;
		count++;
	}
	public static int getCount(){//类方法
		return count;
		//return this.count会报错，因为count为静态变量，存在程序的
		//静态数据区，与实例无关
	} 
}
public class Practice14
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("No1");
		System.out.println(b1.getCount());
		Book b2 = new Book("No2");
		System.out.println(b2.getCount());
		System.out.println(Book.getCount());//因为用static修饰后与实例无关
		//所以可以用类型或者实例.来访问

	}
}
