//������������Զ�����ת����ǿ������ת��
class Parent
{
	String s = "����s";
}
class Child extends Parent
{
	String s = "����s";//��������
}
public class Practice21
{
	public static void main(String[] args) 
	{
		Parent p1,p2,p3;
		Child c1,c2,c3;
		Child c4 = new Child();
		Parent p4 = new Parent();
		System.out.println(p4.s);//����s
		p4 = c4;//�Զ�ת��
		//�൱��int i;double j;j = i;j��Ϊi��double��ʽ
		//��iû�䣬p��Χ��c��ΧС������С��������Զ�ת��
		System.out.println(c4.s);//����s
		System.out.println(p4.s);//����s
		c1 = (Child) p4;//c1Ϊû��ָ���
		//ǿ��ת����i = (int) j;i��Ϊj��int��ʽ��j����
		System.out.println(p4.s);//����s
		System.out.println(c1.s);//����s

		System.out.println("end");//����s
		c2 = (Child) p4;
		System.out.println(p4.s);//����s
		System.out.println(c2.s);//����s
		
	}
}
