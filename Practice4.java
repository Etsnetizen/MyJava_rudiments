public class Practice4
{
	int a = 10;
	public void print(){
		System.out.println("a="+a);
		a = 30;
		System.out.println("a="+a);
	}
	public static void main(String[] argv){
		Practice4 glo = new Practice4();//�����Զ������һ��ʵ��������
		System.out.println(glo.a);
		glo.print();
		System.out.println(glo.a);
		
	}
}