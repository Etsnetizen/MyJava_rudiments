public class Practice17
{
	public Practice17(){
		System.out.print("���췽��-->");
	}
	{//�����ǷǾ�̬�����
		System.out.print("�Ǿ�̬�����-->");
	}
	static {
		System.out.print("��̬�����-->");
	}//��̬�����ֻ�ڵ�һ��new��ִ��һ�Σ�֮�����new����ִ��
	public static void  test(){
		System.out.println("��ͨ�����еĴ����");
	}
	public static void main(String[] args) 
	{
		Practice17 t1 = new Practice17();
		t1.test();
		Practice17 t2 = new Practice17();
		t2.test();
		//PS F:\�ҵ�java\����> java Practice17
		//��̬�����-->�Ǿ�̬�����-->���췽��-->��ͨ�����еĴ����
		//�Ǿ�̬�����-->���췽��-->��ͨ�����еĴ����
		test();//��ΪmainҲ�Ǿ�̬���������Կ���ֱ�ӵ��þ�̬����test
	}
}
