public class Practice11
{
	private String name;
	private String sex;
	private int age;
	public static void main(String[] argv){
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