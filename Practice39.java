//�û��Զ����쳣
public class Practice39
{
	public static void main(String[] argv){
		try{
			Practice39.checknum(1);
			//�����쳣���ƥ��catch���������������ִ�д���
			Practice39.checknum(10);
			System.out.println("passed");
		}
		catch(MyException e){
			//e��MyException��һ��ʵ��
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
//ͨ���쳣�඼��ͬһ����һ�����У�����ֻ������ʾ
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
		//this.super();//super()��ִ�и���Ĺ��췽����
		//this()����ִ�е�ǰ��Ĺ��췽��������
		this();
		this.text = text;
	}
}