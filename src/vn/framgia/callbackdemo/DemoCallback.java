package vn.framgia.callbackdemo;

public class DemoCallback {

	private EventListener eventListener;

	public void registerOnEventListener(EventListener eventListener) {
		this.eventListener = eventListener;
	}

	public void doWork() {

		System.out.println("Performing callback before synchronous Task");
		if (this.eventListener != null) {
			eventListener.onEvent();
		}
	}

	public static void main(String[] args) {
		DemoCallback obj = new DemoCallback();
		EventListener eventListener = new EventListenerImp();
		obj.registerOnEventListener(eventListener);
		obj.doWork();
	}
}