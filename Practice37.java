import java.io.FileInputStream;
import java.io.IOException;
public class Practice37
{
	public static void main(String[] argv) {
	//��throws���������쳣
	FileInputStream in = new FileInputStream("test");
	int b;
	b = in.read();
	while(b != -1){
		System.out.println((char) b );
		b = in.read();
	}
	in.close();
	System.out.println("�������");
}
}
