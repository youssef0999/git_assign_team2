import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
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
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
