import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice29_clone_book {
    
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
    }

}
class Stu implements Cloneable{
    String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//throws�������ǣ�ִ�е�ǰ�������ܻ��׳��쳣��
							//���׳��ˣ�������һ�������������׸�main����
    }
    
}