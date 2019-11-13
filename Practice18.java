//
public class Practice18 extends Practice18_1
{
	public Practice18(){
		//super();
		System.out.println("Practice18无参构造方法");
	}
	public Practice18(String name){
		System.out.println("Practice18有参构造方法");
	}
	public static void main(String[] args) 
	{
		Practice18 t1 = new Practice18();
		System.out.println("end");
		Practice18 t2 = new Practice18("aab");
	}
}
