import java.lang.Math; 

public class CircleArea implements ISubscriber,ITestable{

	@Override
	public void notifySubscriber(Topic topic) {
		int r=Integer.parseInt(topic.getInput());
		// TODO Auto-generated method stub
		System.out.println("CircleArea ="+CircleArea(r));
	}
	
	public double CircleArea(int r)
	{
		double rd = r;
		double sqpow = 2;
		double rsq = Math.pow(rd, sqpow);
		return (3.14*rsq);
		
	}

	@Override
public boolean test() {
		
		return Math.abs(this.CircleArea(10) - 314) ==0;
		
	}

}
