class Student
{
	static int num;
	int number;
	void add1(){
		num++ ;//�Ծ�̬����num+1������Ա���
	}
	void add2(){
		number++;
	}
}
public class Practice15
{
	public static void main(String[] argv){
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1.num);//0
		System.out.println(s1.number);//0
		s1.add1();//��num+1
		s1.add2();//��number+1
		System.out.println(s1.number);//1
		s1.add2();
		System.out.println(s1.number);//2
		System.out.println(s2.number);//0
		System.out.println(s2.num);//1
		}
}