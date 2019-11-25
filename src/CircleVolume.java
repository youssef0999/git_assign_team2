
public class CircleVolume  implements ISubscriber,ITestable {
	@Override
	public void notifySubscriber(Topic topic) {
		int r=Integer.parseInt(topic.getInput());
		// TODO Auto-generated method stub
		System.out.println("CircleVolume ="+CircleVolume(r));
	}

	public double CircleVolume(int r)
	{
		return ((4/3)*3.14*(r*r*r));
		
	}
	@Override
	public boolean test() {
		
		return Math.abs(this.CircleVolume(5) - 523.33)< 1e-5;
		
	}


}


