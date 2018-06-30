package javareferencepractice;

public class BoundedType<T extends Number> {
	
	
	T[] obj;

	public BoundedType(T[] obj) {
		super();
		this.obj = obj;
	}

	public T[] getObj() {
		return obj;
	}
	
	
	double average(){
		
		double sum = 0;
		for (int i = 0; i < obj.length; i++) {
			sum+=obj[i].doubleValue();
		}
		return sum/obj.length;
	}
	

}
