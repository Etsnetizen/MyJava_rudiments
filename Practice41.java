import java.util.*;
public class  Practice41
{
	public static void main(String[] args) 
	{
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("旺财",1001));
		Dog dog1 = new Dog("狗剩",1002);
		dogs.add(dog1);
		dogs.add(new Dog("美美",1003));
		dogs.add(2,new Dog("臭臭",1009));//指定在第2个位置进行插入
		//第一种遍历方式
		for(Dog item : dogs){
			System.out.println("name:" + item.name + "id:" + item.id);
		}
		//第二种遍历方式
		System.out.println("-----------");
		for(int i =0;i<dogs.size();i++){
			Dog temp_dog = (Dog)dogs.get(i);
			System.out.println("name:" + temp_dog.name + "id:" + temp_dog.id);
		}
	}
}
class Dog
{
	String name;
	int id;
	public Dog(String name,int id){
		this.name = name;
		this.id = id;
	}
}
