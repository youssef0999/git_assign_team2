
public class Test {
	private static ITestable subscribers [] = {
			new FibonacciSubscriber(),
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new CircleCircumference(),
			new MultiplicationSeries(),
			new TwoPowerN(),
			new CircleVolume(),
			new LucaSeries(),
			new SphereArea(),
			new SummationSeries()
	};
	public static void main(String[] args) {
		for (ITestable sub : subscribers)
			if(sub.test() == false) System.exit(1); // test fails
	}
}
