abstract class shape
{
	protected int width,heigh,radius;
	public final double pai = 3.14;
	public shape(int width,int heigh){
		this.width = width;
		this.heigh = heigh;
	}
	public shape(int radius){
		this.radius = radius;
	}
	public String toString(){
		return "shape:" + width + heigh;
	}
	protected abstract void area();//抽象方法，不能有{}
}  
class rectangle extends shape
{
	public rectangle(int width,int heigh){
		super(width,heigh);
	}
	public String toString(){
		return "rectangle:" + (width * heigh);
	}
	public void area(){};
}

class circle extends shape
{
	public circle(int radius){
		super(radius);
	}
	public String toString(){
		System.out.println(pai + this.radius + "11");
		return "circle:" + (pai * radius * radius);
	}
	public void area(){};
}
public class Practice23
{
	public static void main(String[] argv){
		rectangle r1 = new rectangle(4,5);
		circle c1 = new circle(10);
		System.out.println(r1.toString());
		System.out.println(c1.toString());
	}
}