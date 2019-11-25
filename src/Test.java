
public class Test {
	private static ITestable subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new CircleCircumference(),
			new MultiplicationSeries()
	};
	public static void main(String[] args) {
		for (ITestable sub : subscribers)
			if(sub.test() == false) System.exit(1); // test fails
	}
}
