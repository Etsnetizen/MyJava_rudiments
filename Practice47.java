//��׼����System.in
import java.util.Scanner;
public class  Practice47
{
	public static void main(String[] args) 
	{
		Scanner t = new Scanner(System.in);
		System.out.println("�������ַ���");
		while(true){
			String temp_str = t.nextLine();
			//�ȴ�����һ���ַ������س����������س���һֱ��������
			if(temp_str.equals("exit")){
				break;
			}
			System.out.println(">>>" + temp_str);
		}
		System.out.println("����������");
		while(true){
			int temp_int = t.nextInt();
			//������벻����������ᱨ��������Ҳ����
			if(temp_int == 0){
				break;
			}
			System.out.println(">>>" + temp_int);
		}
	}
}
