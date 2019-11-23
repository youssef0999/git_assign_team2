
public class FibonacciSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(Topic topic) {
		int num = Integer.parseInt(topic.getInput());
		System.out.println("Fibonacci of " + num + " is " + this.fib(num));
	}
	
	private int fib(int num) {
		if(num < 2) return num;
		int a = 0, b = 1;
		for(int i=2; i<=num; ++i) {
			int tmp = a;
			a = b;
			b = tmp + b;
		}
		return b;
	}
}
