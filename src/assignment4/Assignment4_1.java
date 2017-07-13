package assignment4;
class Overload
{
	void methodToOverride()
	{
		System.out.println("Method of Base Class");
	}
}
public class Assignment4_1 extends Overload
{
	void methodToOverride()	//overriding method
	{
		System.out.println("Method of Derived Class");
	}
    void demo (int a)
    {
       	System.out.println ("a: " + a);
    }
    void demo (float a, float b)	//overloading method
    {
       	System.out.println ("a and b: " + a + "," + b);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Overload Obj1 = new Overload();		//Overload reference and object
		Overload Obj2 = new Assignment4_1();	//Overload reference but Assignment4_1 object
		Assignment4_1 dc = new Assignment4_1();
		System.out.println("Method Overriding");
		Obj1.methodToOverride();	//runs he method in Overload class
		Obj2.methodToOverride();	//runs the method in Assignment4_1 class
		System.out.println("Method Overloading");
        double result;
        dc.demo(10);
        dc.demo(10.5f,20.5f);

	}

}
