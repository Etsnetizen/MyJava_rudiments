//��ObjectInputStream��ȡ��ObjectOutputStrean�������
import java.io.*;
public class  Practice52
{
	public static void main(String[] args) 
	{
		/*�������*/
		System.out.println("��������ļ�");
		FileOutputStream f1 = new FileOutputStream("io_example/object.dat");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		Student s1 = new Student("�µ»�",1800502108);
		o1.writeObject(s1);
		s1.stu_print();
		o1.close();
		/*��ȡ����*/
		System.out.println("���ļ���ȡ����");
		FileInputStream f2 = new FileInputStream("io_example/object.dat");
		ObjectInputStream o2 = new ObjectInputStream(f2);
		Student s2 ;
		s2 = (Student) o2.readObject();
		s2.stu_print();
		o2.close();
	}
}
class Student implements Serializable
{
	String stu_name;
	int stu_id;
	public Student(String name,int id){
		this.stu_name = name;
		this.stu_id = id;
	}
	protected void stu_print(){
		System.out.println("stu_name is " + this.stu_name);
		System.out.println("stu_id is " + this.stu_id);
	}
}
