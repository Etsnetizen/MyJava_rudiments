//io��
import java.io.*;
public class Practice49
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream t1 = new FileInputStream("io_example/test.txt");
		System.out.println((char)t1.read());
		System.out.println(t1.read());
		int i,b;
		b = t1.read();//read����������һ���ֽ�
		for(i =0;b!=-1;i++){
			System.out.print((char)b);
			b = t1.read();
		}
		System.out.println("����Ϊ" + i);
		




		FileInputStream t2 = null;
		int n=0;
		byte b1[] = new byte[8];//�����ֽ�����
		try{
			t2 = new FileInputStream("io_example/test.txt");
			System.out.println("�Ƿ�֧������ǣ�" + t2.markSupported());
			n = t2.read(b1,3,5);
			//��ȡt2��5���ַ�,���ֽ�����b�ĵ�����λ�ÿ�ʼ����5������()
			t2.close();//�ر���
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			if(t2 != null){
				t2 = null;//double check
			}
		}
		System.out.println("��ӡ�ֽ�����");
		for(i=0;i<b1.length;i++){
			System.out.print("b1[" + i + "]=" + b1[i] + "\t");
		}
		System.out.println("�ֽ��������ַ���ʽ��ӡ");
		for(i=0;i<b1.length;i++){
			System.out.print("b1[" + i + "]=" + (char)b1[i]+ "\t");
		}
	}
}
