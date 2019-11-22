//银行取款自定义异常类
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
			System.out.println("取款成功");
			this.funds = funds - money;
		}
	}
}
//操作失败总异常
class ExecutionFailureException extends Exception
{
	String mesg = "你的执行操作已失败";
	String text;
	public ExecutionFailureException(){
		
	}
	public ExecutionFailureException(String text){
		this();
		this.text = text;
	}
}
//资金不足异常
class InsufficientFundsException extends ExecutionFailureException
{
	String mesg = "你的资金不足，执行失败";
	public InsufficientFundsException(){
	
	}
	public InsufficientFundsException(String text){
		super();//super()调用必须是第一个语句
		this.text = text;//super.text?
	}

}