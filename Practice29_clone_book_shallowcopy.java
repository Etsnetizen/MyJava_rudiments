import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice29_clone_book_shallowcopy {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Stu stu = new Stu();//����mainҲ����throws���򽫴��쳣�׸�jvm������
        stu.name = "Tom";
        Stu stu1;
        stu1 = stu;//stu��stu1ָ����ͬ��
        System.out.println(stu==stu1);//true
        stu1.name = "LiMing";
        System.out.println("stu:"+stu.name+" stu1:"+stu1.name);//����LiMing
        stu1 = (Stu) stu.clone();
        System.out.println(stu==stu1);//false
        stu1.name = "Tom";
        System.out.println("stu:"+stu.name+" stu1:"+stu1.name);//LiMing Tom
		stu1.pen_1.name = "�����ľ�";
		stu.pen_1.name = "����ľ�";
		System.out.println("stu.pen.name:" + stu.pen_1.name + "stu1.pen.name" + stu1.pen_1.name);
		//stu.pen.name:����ľ�stu1.pen.name����ľ�
    }

}
class Stu implements Cloneable{
    String name;
	Pen pen_1 = new Pen();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//throws�������ǣ�ִ�е�ǰ�������ܻ��׳��쳣��
							//���׳��ˣ�������һ�������������׸�main����
    }
    
}
class Pen implements Cloneable
{
	String name;
}