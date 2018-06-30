package javareferencepractice;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gen<Integer> iob; 
		iob=new Gen<Integer>(50);
		iob.showType();
		System.out.println(iob.getOb());
		
		
		Gen<String> strobj;
		strobj=new Gen<String>("arjun"); 
		strobj.showType();
		System.out.println(strobj.getOb());
		
	//	iob=strobj; //not possible

	}

}
