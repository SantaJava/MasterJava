package eventHandler;

import eventHandler.Button.onClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		onClickListener listener1 = new CallListener();
		
		//btn.setOnClickListener(new CallListener());
		btn.setOnClickListener(listener1);
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		onClickListener faxListener = new onClickListener() { //�������̽� �θ��� �ٷ� �����ϰڴ�.
			@Override
			public void onClick() {
				System.out.println("Fax is sending.");
			}
		};
		
		btn.setOnClickListener(faxListener);
		
		btn.setOnClickListener(new onClickListener() {			
			@Override
			public void onClick() {
				System.out.println("Sending FAX.");// TODO Auto-generated method stub				
			}
		});
		
		
		btn.touch();
	}
}
