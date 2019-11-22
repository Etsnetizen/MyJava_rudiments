import java.util.*;
public class Practice43
{
	public static void main(String[] args) 
	{
		LinkedList<Object> t1 = new LinkedList<Object>();
		t1.add("hello");
		t1.add("world");
		t1.add(new Integer(2345));
		t1.add(new Object());
		t1.add(new test());
		//生成t1迭代器对象
		Iterator<Object> t1_iterator = t1.iterator();
		while(t1_iterator.hasNext()){
			System.out.println(t1_iterator.next());
			//返回的是一个对象（调用toString方法）
		}
		if(t1.indexOf(2345) > 0){
			System.out.println("hello is in t1");
			System.out.println(t1.indexOf(2345));
		}
		else {
			System.out.println("hello is not in t1");
		}
	}
}
class test
{
	public test(){
	
	}
	public String toString(){
		
		return "hi";
	}
}