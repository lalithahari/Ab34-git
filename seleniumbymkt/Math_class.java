package seleniumbymkt;

import org.testng.annotations.Test;
//math is one of the class which will give method called random  that give us a value between 0.1 and 1.0
public class Math_class 
{
@Test
public void scenario1()
{
double q=Math.PI;
System.out.println(q);                      
System.out.println(Math.addExact(12,34));
System.out.println(Math.subtractExact(10,100));
System.out.println(Math.max(1,2));
System.out.println(Math.multiplyExact(4, 7));
System.out.println(Math.random());
}
}