//
public class Practice18 extends Practice18_1
{
	public Practice18(){
		//super();
		System.out.println("Practice18�޲ι��췽��");
	}
	public Practice18(String name){
		System.out.println("Practice18�вι��췽��");
	}
	public static void main(String[] args) 
	{
		Practice18 t1 = new Practice18();
		System.out.println("end");
		Practice18 t2 = new Practice18("aab");
	}
}
