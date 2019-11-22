//����ȡ���Զ����쳣��
public class Practice39_demo
{
	private int funds;
	public Practice39_demo(int funds){
		this.funds = funds;
	}
	public static void main(String[] argv) {
		Practice39_demo user1 = new Practice39_demo(1000);
		try{
			user1.WithdrawMoney(500);
		}
		catch(InsufficientFundsException e){
			System.out.println(e.mesg);
		}
	}
	private void WithdrawMoney(int money) throws InsufficientFundsException{
		if(money > this.funds){
			throw new InsufficientFundsException();
		}
		else{
			System.out.println("ȡ��ɹ�");
			this.funds = funds - money;
		}
	}
}
//����ʧ�����쳣
class ExecutionFailureException extends Exception
{
	String mesg = "���ִ�в�����ʧ��";
	String text;
	public ExecutionFailureException(){
		
	}
	public ExecutionFailureException(String text){
		this();
		this.text = text;
	}
}
//�ʽ����쳣
class InsufficientFundsException extends ExecutionFailureException
{
	String mesg = "����ʽ��㣬ִ��ʧ��";
	public InsufficientFundsException(){
	
	}
	public InsufficientFundsException(String text){
		super();//super()���ñ����ǵ�һ�����
		this.text = text;//super.text?
	}

}