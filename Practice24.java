abstract class Vehicle 
{
	public abstract void calcFuelEfficiency();
	public abstract void calcTripDistance();
}
abstract class RiverBarge extends Vehicle
{
	public void calcFuelEfficiency(){
	
	}
	/*
	public void calcTripDistance(){
	
	}*///如果子类没有重写父类的抽象方法，由于继承的关系，
//子类会继承父类的抽象方法，相当于子类也包含一个抽象方法，所以要声明abstract

}
public class Practice24
{
	public static void main(String[] argv){
	
	}
}
