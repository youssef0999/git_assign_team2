import java.util.ArrayList;
import java.util.List;

public class Topic {
	private String m_input;
	private List<ISubscriber> subscribers;
	
	public Topic() {
		subscribers = new ArrayList<ISubscriber>();
	}
	
	public void addSubscriber(ISubscriber sub) {
		subscribers.add(sub);
	}
	
	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}
	
	public void dispatchEvent(String input) {
		m_input = input;
		for (ISubscriber sub : this.getSubscribers()) {
			sub.notifySubscriber(this);
		}
	}
	
	public synchronized String getInput() {
		return m_input;
	}
}
