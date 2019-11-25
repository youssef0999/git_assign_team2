
public class MultiplicationSeries implements ISubscriber,ITestable{
 

	@Override
	public boolean test() {
		return this.MultiplicationSeries(5)==120;
	}

	@Override
	public void notifySubscriber(Topic topic) {
		int x=Integer.parseInt(topic.getInput());
		System.out.println("MultiplicationSeries = "+ MultiplicationSeries(x));
		
	}
	public int MultiplicationSeries(int n) {
		 int i,fact=1;    
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  } 
		  return fact;
	}

}
