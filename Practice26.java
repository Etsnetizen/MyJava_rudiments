interface People
{
	public static final int id = 10;
	//�ӿ��еĶ������Ĭ����public static final
	public abstract void PeopleList();
	//������㲻��public abstract Ĭ��Ҳ�����
	//void demo_func();
}
class Student implements People
{
	public void PeopleList(){//��д�ӿڵ�PeopleList()����
		System.out.println("i am a student");
	}
	//���û����дdemo_func,�������һ��Ҫ����Ϊ������
}
class Teacher implements People 
{
	public void PeopleList(){
		System.out.println("i am a teacher");
	}
}
public class Practice26
{
	public static void main(String[] argv){
		People p1 ;//�ӿڿ���������������
		p1 = new Student();
		p1.PeopleList();//�������Ƕ��󶨣���̬���ࣩ����p1ָ�����˭
		p1 = new Teacher();
		p1.PeopleList();
		People p2 = new Teacher();//����ֱ���ýӿ������������������ʵ���������е����ֵģ�
		p2.PeopleList();
	}
}