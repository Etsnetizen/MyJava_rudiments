public class Practice35
{
	public static void main(String[] argv){
		try{
		int i = 0;
		String st[] = {"hello","world","hi! java"};
		while(i<5){
			System.out.print("\t" + st[i]);
			i++;
		}
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());//3
			System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: 3
			e.printStackTrace();
			//java.lang.ArrayIndexOutOfBoundsException: 3
        //at Practice35.main(Practice35.java:8)
		}
	}
}
