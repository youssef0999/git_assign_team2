

public class SummationSeries  implements ISubscriber, ITestable {

	@Override
	public void notifySubscriber(Topic topic) {
		int num = Integer.parseInt(topic.getInput());
		System.out.println("Summation of " + num + " is " + this.sum(num));
	}
	
	private int sum(int n) {
		n=n*(n+1)/2;
		return n;
	}

	@Override
	public boolean test() {
		return this.sum(10)==55;
	}
}
