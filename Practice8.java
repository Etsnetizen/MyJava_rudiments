public class Practice8 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = {111,222,333,444,555,666,777,888};
		System.arraycopy(a,0,b,0,a.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
