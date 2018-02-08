package eventHandler;

import java.util.ArrayList;
import java.util.List;

public class Button {
	List<onClickListener> listeners = new ArrayList<>(); //������ 
	onClickListener listener;

	public void setOnClickListener(onClickListener listener) {
		// this.listener = listener;
		listeners.add(listener);
	}

	public void touch() {
		// listener.onClick();
		for (onClickListener listener : listeners) {
			listener.onClick();
		}
	}

	interface onClickListener {
		void onClick();
	}

	public void clear() {
		listeners.clear(); // ����Ʈ�� ����°�, ����Ʈ�� �ν��Ͻ��� �״�� ������ �ǰ� ������Ʈ���� �� ���ְڴٴ� ��. ��ϵ� �����ʵ��� ������Ű�ڴٴ�
	}
}
