public class Practice17
{
	public Practice17(){
		System.out.print("构造方法-->");
	}
	{//这里是非静态代码块
		System.out.print("非静态代码块-->");
	}
	static {
		System.out.print("静态代码块-->");
	}//静态代码块只在第一次new是执行一次，之后继续new不再执行
	public static void  test(){
		System.out.println("普通方法中的代码块");
	}
	public static void main(String[] args) 
	{
		Practice17 t1 = new Practice17();
		t1.test();
		Practice17 t2 = new Practice17();
		t2.test();
		//PS F:\我的java\入门> java Practice17
		//静态代码块-->非静态代码块-->构造方法-->普通方法中的代码块
		//非静态代码块-->构造方法-->普通方法中的代码块
		test();//因为main也是静态方法，所以可以直接调用静态方法test
	}
}
