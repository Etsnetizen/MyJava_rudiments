class Book
{
	String Book_name;//ʵ�����������ڶ���
	private static int count;//����������ھ�̬��������
	public Book(String name){
		this.Book_name = name;
		count++;
	}
	public static int getCount(){//�෽��
		return count;
		//return this.count�ᱨ����ΪcountΪ��̬���������ڳ����
		//��̬����������ʵ���޹�
	} 
}
public class Practice14
{
	public static void main(String[] args) 
	{
		Book b1 = new Book("No1");
		System.out.println(b1.getCount());
		Book b2 = new Book("No2");
		System.out.println(b2.getCount());
		System.out.println(Book.getCount());//��Ϊ��static���κ���ʵ���޹�
		//���Կ��������ͻ���ʵ��.������

	}
}
