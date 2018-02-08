package eventHandler;

public class CallListener implements Button.onClickListener{
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
