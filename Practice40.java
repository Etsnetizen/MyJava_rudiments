import java.util.*;
//ArrayList
public class Practice40
{
	public static void main(String[] argv){
		ArrayList<Object> t1 = new ArrayList<Object>();
		t1.add(new Integer("123"));//��string��������������
		t1.add(new Double(321));
		t1.add(new String("lalala"));
		Boolean b1 = new Boolean(true);
		t1.add(b1);
		//��Ϊ����ֻ�ܱ��渴���������ͣ����Դ洢����������ʱ
		//Ҫ������תΪ����������
		//��ӡ����
		for(int i=0;i < t1.size();i++){
			System.out.println("indexΪ" + i + "��Ԫ��Ϊ��" + t1.get(i));
		}
		//����ǿ��forѭ����ӡ/����
		for(Object item : t1){
			System.out.println(item);
		}
	}
}