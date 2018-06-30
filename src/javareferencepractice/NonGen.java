package javareferencepractice;

public class NonGen {

	Object object;

	public Object getValue() {
		return object;
	}

	public NonGen(Object object) {
		super();
		this.object = object;
	}
	
	public void showType(){
		System.out.println("Type of obj"+object.getClass());
	}
	
}
