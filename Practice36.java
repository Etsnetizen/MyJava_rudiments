import java.io.FileInputStream;
import java.io.IOException;
public class Practice36
{
	public static void main(String[] argv){
		/*��try catch ���������쳣*/
		
		FileInputStream t1 = null;
		try{
			t1 = new FileInputStream("test.txt");
			int b;
			b = t1.read();
			while(b != -1){
				System.out.print((char)b);
				b = t1.read();
			}
			t1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(t1 != null){
				t1  = null;//���μ��t1�Ƿ��Ѿ��ͷ���Դ
			}
			System.out.println("��Դ�Ѿ��ͷ�");
		}
	}
}
}