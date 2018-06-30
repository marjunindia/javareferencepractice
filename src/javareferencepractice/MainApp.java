package javareferencepractice;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer inums[]={1,2,3,4,5};
		
		WildCardArg<Integer> inttype=new WildCardArg<Integer>(inums);
		
		double v=inttype.average();
		
		System.out.println(v);
		
		
		
		Integer inums1[]={1,2,3,4,5};
		
		WildCardArg<Integer> inttype1=new WildCardArg<Integer>(inums1);
		
		double v1=inttype1.average();
		
		System.out.println(v1);
		
		
		Double doublenums[]={1.1,2.2,3.3,4.4,5.5};
		
		WildCardArg<Double> doubletype=new WildCardArg<Double>(doublenums);
		
		double dob=doubletype.average();
		
		System.out.println(dob);
		
		
		
//		if(inttype.sameAvg(inttype1))
//			System.out.println("are same");
//		else
//			System.out.println("not same");

		
		
		if(inttype1.sameAvg(doubletype))
			System.out.println("are same");
		else
			System.out.println("not same");


	}

}
