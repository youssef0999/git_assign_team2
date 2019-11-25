public class SphereArea implements ISubscriber,ITestable {
@Override
public void notifySubscriber(Topic topic) {
 int radius = Integer.parseInt(topic.getInput());	
 System.out.println("SphereArea of " + radius + " is " + this.sArea(radius));
}
private double sArea(int radius) {
 double areaResult; 
 areaResult = (double)((4.0*22.0*radius*radius)/(7.0));
 return areaResult;
 //return (float)((4.0*22.0*radius*radius)/(7.0));	
}
@Override
public boolean test() {
 return this.sArea(7) == 616.0;
}

}