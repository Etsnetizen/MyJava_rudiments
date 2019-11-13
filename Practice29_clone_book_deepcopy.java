import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice29_clone_book_deepcopy {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Stu stu = new Stu();//这里main也用了throws，则将此异常抛给jvm来处理
        stu.name = "Tom";
        Stu stu1;
        stu1 = stu;//stu与stu1指向相同了
        System.out.println(stu==stu1);//true
        stu1.name = "LiMing";
        System.out.println("stu:"+stu.name+" stu1:"+stu1.name);//都是LiMing
        stu1 = (Stu) stu.clone();
        System.out.println(stu==stu1);//false
        stu1.name = "Tom";
        System.out.println("stu:"+stu.name+" stu1:"+stu1.name);//LiMing Tom
		stu1.pen_1.name = "晨光文具";
		stu.pen_1.name = "真彩文具";
		System.out.println("stu.pen.name:" + stu.pen_1.name + "stu1.pen.name" + stu1.pen_1.name);
		//stu.pen.name:真彩文具stu1.pen.name晨光文具
    }

}
class Stu implements Cloneable{
    String name;
	Pen pen_1 = new Pen();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Stu temp = (Stu) super.clone();//先创建Stu的temp实例，然后对他调用父类克隆
        temp.pen_1 = (Pen) pen_1.clone();//克隆Pen（调用了红圈的clone()），在返回temp，这样temp中的pen指向克隆后的地址
        return temp;
	}
    
}
class Pen implements Cloneable{
    String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}