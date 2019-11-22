//��DataOutputStream��DataInputStream���Լ����������ݸ�ϰ
import java.io.*;
public class Practice51
{
	public static void main(String[] args) throws IOException
	{
		byte[] b1 = {50,42,123,20,99};
		FileOutputStream f1 = new FileOutputStream("io_example/data_test.txt");
		DataOutputStream d1 = new DataOutputStream(f1);
		//f1����DataOutputStream�����ˣ������DataOutputStream�Ĺ���
		d1.write(b1,0,b1.length);//��b1��0����ʼд��дlength���ȵ�d1�Ļ�����
		d1.writeBoolean(true);
		d1.writeDouble(23.9);
		d1.writeInt(123);
		d1.writeUTF("java��ã�");
		System.out.println("�������Ѿ�д��" + d1.size());
		d1.flush();//��ջ�������������������ȫ��д���ļ���
		FileInputStream f2 = new FileInputStream("io_example/data_test.txt");
		BufferedInputStream b2 = new BufferedInputStream(f2);
		//Ϊf2���ӻ��幦��
		DataInputStream d2 = new DataInputStream(b2);
		//Ϊb2����DataInputStream����
		System.out.println("���Դ��ж������ֽ���Ϊ" + d2.available());
		System.out.println("֧��mark��reset��" + d2.markSupported());
		d2.skip(5);//����5���ֽ�
		System.out.println("�����ֽں���������");
		System.out.println(d2.readBoolean());
		System.out.println(d2.readDouble());
		System.out.println(d2.readInt());
		d2.mark(1);//�ڵ�ǰ��ȡλ�������
		System.out.println(d2.readUTF());
		d2.reset();//�����ϴ�mark��λ��
		System.out.println(d2.readUTF());
	}
}
