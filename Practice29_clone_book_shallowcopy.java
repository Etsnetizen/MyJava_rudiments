import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice29_clone_book_shallowcopy {
    
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
		//stu.pen.name:真彩文具stu1.pen.name真彩文具
    }

}
class Stu implements Cloneable{
    String name;
	Pen pen_1 = new Pen();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//throws的作用是，执行当前方法可能会抛出异常，
							//若抛出了，则交由上一级来处理（这里抛给main处理）
    }
    
}
class Pen implements Cloneable
{
	String name;
}