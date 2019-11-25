
public class CircleVolume  implements ISubscriber,ITestable {
	@Override
	public void notifySubscriber(Topic topic) {
		int r=Integer.parseInt(topic.getInput());
		// TODO Auto-generated method stub
		System.out.println("CircleVolume ="+CircleVolume(r));
	}

	public double CircleVolume(int r)
	{
		return ((4/3)*3.14*(r^3));
		
	}
	@Override
	public boolean test() {
		
		return (this.CircleVolume(5))==532.33;
		
	}


}


