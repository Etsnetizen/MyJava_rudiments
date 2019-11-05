public class Practice4
{
	int a = 10;
	public void print(){
		System.out.println("a="+a);
		a = 30;
		System.out.println("a="+a);
	}
	public static void main(String[] argv){
		Practice4 glo = new Practice4();//创建自定义类的一个实例（对象）
		System.out.println(glo.a);
		glo.print();
		System.out.println(glo.a);
		
	}
}