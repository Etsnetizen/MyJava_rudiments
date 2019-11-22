//用户自定义异常
public class Practice39
{
	public static void main(String[] argv){
		try{
			Practice39.checknum(1);
			//发生异常后会匹配catch，并不会继续向下执行代码
			Practice39.checknum(10);
			System.out.println("passed");
		}
		catch(MyException e){
			//e是MyException的一个实例
			System.out.println(e.name + "\t" + e.num + "\t" + e.text);
		}
	}
	static void checknum(int i ) throws MyException{
		if (i > 10)
		{
			throw new MyException();
		}else{
			throw new MyException("timeout");
		}
	}
}
//通常异常类都会同一放在一个包中，这里只是做演示
class MyException extends Exception
{
	String name;
	String num;
	String text;
	public MyException(){
		this.name = "MyException_name";
		this.num = "9999";
	}
	public MyException(String text){
		//this.super();//super()是执行父类的构造方法，
		//this()才是执行当前类的构造方法啊！！
		this();
		this.text = text;
	}
}