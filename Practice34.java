class Practice34 
{
	public static void main(String[] args) 
	{
		String s = "ABCDEa";
		char ch1[] = new char[3];
		s.getChars(1,4,ch1,0);
		//从ch1的第0个位置放s的第1个位置到第3(4前一个)个位置的元素
		//所以ch1是BCD
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
