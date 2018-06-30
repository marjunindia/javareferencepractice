package javareferencepractice;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer inums[]={1,2,3,4,5};
		
		BoundedType<Integer> inttype=new BoundedType<Integer>(inums);
		
		double v=inttype.average();
		
		System.out.println(v);
		
		
		Double doublenums[]={1.1,2.2,3.3,4.4,5.5};
		
		BoundedType<Double> doubletype=new BoundedType<Double>(doublenums);
		
		double dob=doubletype.average();
		
		System.out.println(dob);
		
		
		
		// this wont compile because string is not a subclass of numz

//		String  str[]={"arjun","soul"};
//		
//		BoundedType<String> strtype=new BoundedType<String>(doublenums);
//		
//		double st=doubletype.average();
//		
//		System.out.println(st);
		
		/* class gen<T extends Myclass & MyInterface>
		 * 
		 * T must be subclass of Myclass and implement MyInterface
		 * 		
		 */

		

	}

}
