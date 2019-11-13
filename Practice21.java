//父类与子类的自动类型转换和强制类型转换
class Parent
{
	String s = "父类s";
}
class Child extends Parent
{
	String s = "子类s";//参数隐藏
}
public class Practice21
{
	public static void main(String[] args) 
	{
		Parent p1,p2,p3;
		Child c1,c2,c3;
		Child c4 = new Child();
		Parent p4 = new Parent();
		System.out.println(p4.s);//父类s
		p4 = c4;//自动转换
		//相当于int i;double j;j = i;j变为i的double形式
		//而i没变，p范围大，c范围小，所以小→大可以自动转换
		System.out.println(c4.s);//子类s
		System.out.println(p4.s);//父类s
		c1 = (Child) p4;//c1为没有指向的
		//强制转换，i = (int) j;i变为j的int形式，j不变
		System.out.println(p4.s);//父类s
		System.out.println(c1.s);//子类s

		System.out.println("end");//父类s
		c2 = (Child) p4;
		System.out.println(p4.s);//父类s
		System.out.println(c2.s);//子类s
		
	}
}
