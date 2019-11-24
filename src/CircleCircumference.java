
public class CircleCircumference implements ISubscriber,ITestable {
	@Override
	public void notifySubscriber(Topic topic) {
		int r=Integer.parseInt(topic.getInput());
		// TODO Auto-generated method stub
		System.out.println("CircleCircumference ="+CircleCircumference(r));
	}

	public double CircleCircumference(int r)
	{
		return (2*3.14*r);
		
	}
	@Override
	public boolean test() {
		
		return this.CircleCircumference(5)==31.4;
		
	}


}
