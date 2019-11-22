public class Practice44_instanceof
{
	public static void main(String[] args) 
	{
		Object o1 = new Object();
		Parent p1 = new Parent();
		System.out.println((o1 instanceof String)?true:false);
	}
}
class Parent
{

}

