public class Practice10
{
	private String name;
	private String sex;
	private int age;
	public Practice10(){
		super();
		System.out.println("���๹�췽��");
	}
	public Practice10(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void display(){
		System.out.println("����Ϊ:"+name+"�Ա�Ϊ��"+sex+"����Ϊ��"+age);
	}
	public static void main(String[] argv){
		Practice10 p1 = new Practice10();
		p1.display();
	
		Practice10 p2 = new Practice10("����","��",18);
		p2.display();
		p1.display();
		System.out.println(p2.name);
		Test t = new Test();
		t.print_private_variable();
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
}
class Test
{
	void print_private_variable(){
		Practice10 p3 = new Practice10("���»�","��",20);
		//System.out.println(p3.name);
		System.out.println(p3.getname());
		p3.setname("�µ»�");
		System.out.println(p3.getname());
	}
}