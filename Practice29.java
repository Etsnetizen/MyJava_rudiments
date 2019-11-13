public class Practice29 implements Cloneable
{
	int i = 10;
	public static void main(String[] args) 
	{
		Practice29 p1 = new Practice29();
		Practice29 p2;
		p2 = (Practice29)p1.clone();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

