
public class CircleCircumference implements ISubscriber,ITestable {
	@Override
	public void notifySubscriber(Topic topic) {
		int r=Integer.parseInt(topic.getInput());
		// TODO Auto-generated method stub
		System.out.println("CircleCircumference ="+2*3.14*r);
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return false;
	}


}
