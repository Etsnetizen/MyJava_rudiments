import java.io.IOException;
public class Practice38
{
	public static void main(String[] argv){
		try{
			method1();
		}
		catch(IllegalAccessException e){
			System.out.println("�Ѳ����쳣��" + e.toString());
		}
		catch(IOException ioe){
			System.out.println("����io�쳣");
		}
	}
	static void method1() throws IOException,IllegalAccessException{
		System.out.println("�����쳣");
		throw new IllegalAccessException();//�׳�һ���쳣��ʵ��
	}
}