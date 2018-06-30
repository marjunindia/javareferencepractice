package javareferencepractice;

public class WildCardArg<T extends Number> {

	T[] obj;

	public WildCardArg(T[] obj) {
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
	
	
	// working if any type
	boolean sameAvg(WildCardArg<?> obj){
		if(average()==obj.average())
			return true;

		return false;
	}
	
	
	// working if both are same type
	boolean sameAvg1(WildCardArg<T> obj){
		if(average()==obj.average())
			return true;

		return false;
	}
	

	
	
	
}
