package eventHandler;

import java.util.ArrayList;
import java.util.List;

public class Button {
	List<onClickListener> listeners = new ArrayList<>(); //다형성 
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
		listeners.clear(); // 리스트를 지우는것, 리스트의 인스턴스는 그대로 유지가 되고 엘리먼트들을 다 없애겠다는 뜻. 등록된 리스너들을 해제시키겠다는
	}
}
