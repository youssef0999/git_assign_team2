public class TwoPowerN implements ISubscriber,ITestable {
    @Override
    public void notifySubscriber(Topic topic) {
        int n=Integer.parseInt(topic.getInput());
        // TODO Auto-generated method stub
        System.out.println("power ="+TwoPowerN(n));
    }

    public double TwoPowerN(int n)
    {
        int pow=1;
                for(int i=0;i<n;i++)
                {
                    pow=2*pow;
                }
        return pow;
    }
    @Override
    public boolean test() {
        
        return TwoPowerN(5)==32;
        
    }


}