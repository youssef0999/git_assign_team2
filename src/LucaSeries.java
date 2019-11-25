
public class LucaSeries implements ISubscriber,ITestable{
	public int lucasSeries(int n)
	{
	
		int first = 2 ;
		int second = 1 ;
		int temp = 0 ;
		
		if( n==1)
		{
			return 2 ;
		}
		if (n==2)
		{
			return 1 ;
		}
		for(int i=2 ;i<n ;i++)
		{
			temp = first + second ;
			first = second ;
			second = temp ;
		}
		return second ;
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.lucasSeries(5)==7;
	}

	@Override
	public void notifySubscriber(Topic topic) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(topic.getInput());
		System.out.println("LucasSeries = "+ lucasSeries(x));
	}

}
