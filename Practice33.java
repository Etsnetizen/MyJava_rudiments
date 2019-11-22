public class Practice33
{
	public static void main(String[] args) 
	{
		String s1 = "this is first";
		String s2 = "this is first";
		String s3 = new String("this is first");
		String s4 = s1;
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//true
	}
}
