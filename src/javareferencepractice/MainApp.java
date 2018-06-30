package javareferencepractice;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gen<Integer> iob; // use only reference type.primitive not allowed.
		iob=new Gen<Integer>(50);
		iob.showType();
		int value=iob.getValue();
		System.out.println(value);
		
		
		Gen<String> strobj;
		strobj=new Gen<String>("arjun"); 
		strobj.showType();
		String value1=strobj.getValue();
		System.out.println(value1);
		
	//	iob=strobj; //not possible
		
		
		
		// this is also generic but it not type safety
		
		NonGen nonGen;
		nonGen=new NonGen(88);
		nonGen.showType();
		
		int v=(int) nonGen.getValue();
		System.out.println(v);
		
		
		NonGen nonGenstr;
		nonGenstr=new NonGen("adadadad");
		nonGenstr.showType();
		
		String vstr=(String) nonGenstr.getValue();
		System.out.println(vstr);
		
		
		//nonGen=nonGenstr;  //syntactically correct
		
		
		
		

	}

}
