//用DataOutputStream和DataInputStream，以及流参数传递复习
import java.io.*;
public class Practice51
{
	public static void main(String[] args) throws IOException
	{
		byte[] b1 = {50,42,123,20,99};
		FileOutputStream f1 = new FileOutputStream("io_example/data_test.txt");
		DataOutputStream d1 = new DataOutputStream(f1);
		//f1经过DataOutputStream进化了，获得了DataOutputStream的功能
		d1.write(b1,0,b1.length);//从b1第0个开始写，写length长度到d1的缓存区
		d1.writeBoolean(true);
		d1.writeDouble(23.9);
		d1.writeInt(123);
		d1.writeUTF("java你好！");
		System.out.println("缓冲区已经写了" + d1.size());
		d1.flush();//清空缓冲区，将缓冲区内容全部写到文件中
		FileInputStream f2 = new FileInputStream("io_example/data_test.txt");
		BufferedInputStream b2 = new BufferedInputStream(f2);
		//为f2增加缓冲功能
		DataInputStream d2 = new DataInputStream(b2);
		//为b2增加DataInputStream功能
		System.out.println("可以从中读到的字节数为" + d2.available());
		System.out.println("支持mark和reset？" + d2.markSupported());
		d2.skip(5);//跳过5个字节
		System.out.println("跳过字节后，内容如下");
		System.out.println(d2.readBoolean());
		System.out.println(d2.readDouble());
		System.out.println(d2.readInt());
		d2.mark(1);//在当前读取位置做标记
		System.out.println(d2.readUTF());
		d2.reset();//返回上次mark的位置
		System.out.println(d2.readUTF());
	}
}
