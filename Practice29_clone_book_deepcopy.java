import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice29_clone_book_deepcopy {
    
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
		//stu.pen.name:����ľ�stu1.pen.name�����ľ�
    }

}
class Stu implements Cloneable{
    String name;
	Pen pen_1 = new Pen();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Stu temp = (Stu) super.clone();//�ȴ���Stu��tempʵ����Ȼ��������ø����¡
        temp.pen_1 = (Pen) pen_1.clone();//��¡Pen�������˺�Ȧ��clone()�����ڷ���temp������temp�е�penָ���¡��ĵ�ַ
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