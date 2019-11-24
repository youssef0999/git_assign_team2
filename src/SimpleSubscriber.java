
public class SimpleSubscriber implements ISubscriber, ITestable {

	@Override
	public void notifySubscriber(Topic topic) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am a simple subscriber and I am notified with " + topic.getInput());
	}

	@Override
	public boolean test() {
		return true;
	}

}
