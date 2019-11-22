//io流
import java.io.*;
public class Practice49
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream t1 = new FileInputStream("io_example/test.txt");
		System.out.println((char)t1.read());
		System.out.println(t1.read());
		int i,b;
		b = t1.read();//read（）出的是一个字节
		for(i =0;b!=-1;i++){
			System.out.print((char)b);
			b = t1.read();
		}
		System.out.println("长度为" + i);
		




		FileInputStream t2 = null;
		int n=0;
		byte b1[] = new byte[8];//创建字节数组
		try{
			t2 = new FileInputStream("io_example/test.txt");
			System.out.println("是否支持做标记？" + t2.markSupported());
			n = t2.read(b1,3,5);
			//读取t2的5个字符,从字节数组b的第三个位置开始，放5个长度()
			t2.close();//关闭流
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			if(t2 != null){
				t2 = null;//double check
			}
		}
		System.out.println("打印字节数组");
		for(i=0;i<b1.length;i++){
			System.out.print("b1[" + i + "]=" + b1[i] + "\t");
		}
		System.out.println("字节数组以字符形式打印");
		for(i=0;i<b1.length;i++){
			System.out.print("b1[" + i + "]=" + (char)b1[i]+ "\t");
		}
	}
}
