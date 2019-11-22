import java.io.IOException;
public class Practice38
{
	public static void main(String[] argv){
		try{
			method1();
		}
		catch(IllegalAccessException e){
			System.out.println("已捕获异常：" + e.toString());
		}
		catch(IOException ioe){
			System.out.println("捕获到io异常");
		}
	}
	static void method1() throws IOException,IllegalAccessException{
		System.out.println("发出异常");
		throw new IllegalAccessException();//抛出一个异常的实例
	}
}