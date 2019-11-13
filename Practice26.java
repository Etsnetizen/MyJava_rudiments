interface People
{
	public static final int id = 10;
	//接口中的定义的量默认是public static final
	public abstract void PeopleList();
	//这里就算不加public abstract 默认也是这个
	//void demo_func();
}
class Student implements People
{
	public void PeopleList(){//重写接口的PeopleList()方法
		System.out.println("i am a student");
	}
	//如果没有重写demo_func,则这个类一定要声明为抽象类
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
		People p1 ;//接口可以用来声明变量
		p1 = new Student();
		p1.PeopleList();//发生的是动绑定（动态联编）会检查p1指向的是谁
		p1 = new Teacher();
		p1.PeopleList();
		People p2 = new Teacher();//可以直接用接口来声明变量（和类的实例化还是有点区分的）
		p2.PeopleList();
	}
}