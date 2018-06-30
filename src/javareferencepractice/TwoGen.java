package javareferencepractice;

public class TwoGen<A,B> {
	
	A obj1;
	B obj2;
	public TwoGen(A obj1, B obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public A getObj1() {
		return obj1;
	}
	public B getObj2() {
		return obj2;
	}
	
	void showTypes(){
		System.out.println("type of A is"+obj1.getClass());
		System.out.println("type of A is"+obj2.getClass());

	}
	

}
