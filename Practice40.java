import java.util.*;
//ArrayList
public class Practice40
{
	public static void main(String[] argv){
		ArrayList<Object> t1 = new ArrayList<Object>();
		t1.add(new Integer("123"));//用string构造数据类型类
		t1.add(new Double(321));
		t1.add(new String("lalala"));
		Boolean b1 = new Boolean(true);
		t1.add(b1);
		//因为集合只能保存复合数据类型，所以存储简单数据类型时
		//要将他们转为数据类型类
		//打印集合
		for(int i=0;i < t1.size();i++){
			System.out.println("index为" + i + "的元素为：" + t1.get(i));
		}
		//用增强型for循环打印/遍历
		for(Object item : t1){
			System.out.println(item);
		}
	}
}