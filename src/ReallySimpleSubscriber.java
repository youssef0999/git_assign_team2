
public class ReallySimpleSubscriber implements ISubscriber, ITestable {
	@Override
	public void notifySubscriber(Topic topic) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am really a simple subscriber and I am notified with " + topic.getInput());
	}

	@Override
	public boolean test() {
		return true;
	}
}
