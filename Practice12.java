public class Practice12
{
	private String color;
	private int height;
	private int width;
	/*
	public  Practice12(){
		System.out.println("这是无参构造方法");
	}*/
	public  Practice12(String color,int height,int width){
		this.color = color;
		this.height = height;
		this.width = width;
		System.out.println("这是有参构造方法");
	}
	public static void main(String[] argv){
		Practice12 p1 = new Practice12();
	}
}