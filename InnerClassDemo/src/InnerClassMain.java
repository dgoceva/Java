
public class InnerClassMain {

	public InnerClassMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.data());

		TestOuter1.Inner obj=new TestOuter1.Inner();  
		obj.msg();   
		TestOuter1.Inner.msg1();
	}

}
