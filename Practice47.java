//标准输入System.in
import java.util.Scanner;
public class  Practice47
{
	public static void main(String[] args) 
	{
		Scanner t = new Scanner(System.in);
		System.out.println("请输入字符串");
		while(true){
			String temp_str = t.nextLine();
			//等待输入一行字符串，回车结束，不回车则一直卡在这里
			if(temp_str.equals("exit")){
				break;
			}
			System.out.println(">>>" + temp_str);
		}
		System.out.println("请输入整数");
		while(true){
			int temp_int = t.nextInt();
			//如果输入不是整数，则会报错，浮点数也不行
			if(temp_int == 0){
				break;
			}
			System.out.println(">>>" + temp_int);
		}
	}
}
