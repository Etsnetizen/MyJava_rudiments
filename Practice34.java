class Practice34 
{
	public static void main(String[] args) 
	{
		String s = "ABCDEa";
		char ch1[] = new char[3];
		s.getChars(1,4,ch1,0);
		//��ch1�ĵ�0��λ�÷�s�ĵ�1��λ�õ���3(4ǰһ��)��λ�õ�Ԫ��
		//����ch1��BCD
		for(int i=0;i<ch1.length;i++){
			System.out.print("\t" + ch1[i]);
		}
		String s1 = "ABC";
		s1 = s1 + "d";
		System.out.println(s1);
		Double t1 = new Double("231");
		System.out.println(t1);//231.0
	}
}
