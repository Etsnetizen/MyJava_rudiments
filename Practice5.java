public class Practice5
{
	static int count = 2;//被所有这个类的实例共享的全局变量
	public static void main(String[] argv){
		Practice5 first_instance = new Practice5();
		Practice5 second_instance = new Practice5();
		System.out.println(first_instance.count);
		System.out.println(second_instance.count);
		first_instance.count = 5;
		System.out.println(first_instance.count);
		System.out.println(second_instance.count);//打印2 2 5 5
	}
}
